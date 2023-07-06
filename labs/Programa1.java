import graphics.*;

public class Programa1 {
    public static void main(String[] args) {
        Picture cellWhite = Picture.casilleroBlanco();
        Picture cellBlack = Picture.casilleroBlanco().invertir();
        Picture rowTable = cellWhite.alLado(cellBlack)
            .alLado(cellWhite).alLado(cellBlack)
            .alLado(cellWhite).alLado(cellBlack)
            .alLado(cellWhite).alLado(cellBlack);


        Graphics display = new Graphics(rowTable);
        display.print();
    }
}
