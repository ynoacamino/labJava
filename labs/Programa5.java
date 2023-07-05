import graphics.*;

public class Programa5 {
    public static void main(String[] args) {
        Picture cellWhite = Picture.casilleroBlanco();
        Picture cellBlack = Picture.casilleroBlanco().invertir();

        Picture rowTable1 = cellBlack.alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack);

        Picture rowPeons = createPeons(10);
        Picture rowPieces = Picture.torre()
        .alLado(Picture.caballo())
        .alLado(Picture.alfil())
        .alLado(Picture.rey())
        .alLado(Picture.dama())
        .alLado(Picture.alfil())
        .alLado(Picture.caballo())
        .alLado(Picture.torre());
        Picture cellAndPieces = rowPieces.superponer(rowTable1);

        Graphics display = new Graphics(cellAndPieces);
        display.print();
    }

    public static Picture createPeons(int n) {
        if(n == 1 ) return Picture.peon();
        Picture row = Picture.peon().alLado(createPeons(n-1));
        return row;
    }
}

