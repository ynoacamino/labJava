package graphicsClass;
import graphics.*;

public class Ejercicio05 {
    public static void main(String[] args) {
        Picture cellWhite = Picture.casilleroBlanco();
        Picture cellBlack = Picture.casilleroBlanco().invertir();

        Picture rowTable1 = cellBlack.alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite);

        Picture rowPieces = Picture.torre()
        .alLado(Picture.caballo())
        .alLado(Picture.alfil())
        .alLado(Picture.rey())
        .alLado(Picture.dama())
        .alLado(Picture.alfil())
        .alLado(Picture.caballo())
        .alLado(Picture.torre());

        Picture cellAndPieces = rowPieces.invertir().superponer(rowTable1);

        Graphics display = new Graphics(cellAndPieces);
        display.print();
    }
}

