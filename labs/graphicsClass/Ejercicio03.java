package graphicsClass;
import graphics.*;

public class Ejercicio03 {
    public static void main(String[] args) {
        Picture cellWhite = Picture.casilleroBlanco();
        Picture cellBlack = Picture.casilleroBlanco().invertir();

        Picture rowTable1 = cellWhite.alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(cellWhite);

        Picture rowTable2 = rowTable1.invertir();

        Picture voidHalfTable = rowTable2.encima(rowTable1.encima(rowTable2).encima(rowTable1));

        Graphics display = new Graphics(voidHalfTable);

        display.print();

    }
}
