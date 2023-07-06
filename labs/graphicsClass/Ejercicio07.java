package graphicsClass;
import graphics.*;

public class Ejercicio07 {
  public static void main(String[] args) {
    Picture cellWhite = Picture.casilleroBlanco();
    Picture cellBlack = Picture.casilleroBlanco().invertir();
    Picture damaWithCellBlack = Picture.dama().superponer(cellBlack);
    Picture damaWithCellWhite = Picture.dama().superponer(cellWhite);

    Picture rowTable1 = cellWhite.alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(cellWhite).alLado(damaWithCellBlack)
        .alLado(cellWhite).alLado(cellBlack);

    Picture rowTable2 = cellBlack.alLado(cellWhite)
        .alLado(damaWithCellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite);

    Picture rowTable3 = cellWhite.alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(damaWithCellWhite).alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack);

    Picture rowTable4 = cellBlack.alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(damaWithCellWhite);

    Picture rowTable5 = damaWithCellWhite.alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack);

    Picture rowTable6 = cellBlack.alLado(cellWhite)
        .alLado(cellBlack).alLado(damaWithCellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite);

    Picture rowTable7 = cellWhite.alLado(damaWithCellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack)
        .alLado(cellWhite).alLado(cellBlack);

    Picture rowTable8 = cellBlack.alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(damaWithCellBlack).alLado(cellWhite);

    Picture completeTable = rowTable1
      .encima(rowTable2)
      .encima(rowTable3)
      .encima(rowTable4)
      .encima(rowTable5)
      .encima(rowTable6)
      .encima(rowTable7)
      .encima(rowTable8);

    // HALF TABLE WITHOUT PIECES

    Graphics display = new Graphics(completeTable);
    display.print();
  }

}
