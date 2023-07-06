package graphicsClass;
import graphics.*;

public class Ejercicio06 {
  public static void main(String[] args) {
    Picture cellWhite = Picture.casilleroBlanco();
    Picture cellBlack = Picture.casilleroBlanco().invertir();

    Picture rowTable1 = cellBlack.alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite)
        .alLado(cellBlack).alLado(cellWhite);
    Picture rowTable2 = rowTable1.invertir();

    // HALF TABLE WITHOUT PIECES
    Picture voidHalfTable = rowTable1.encima(rowTable2.encima(rowTable1).encima(rowTable2));


    // PAWN AND PIECES LINE WITHOUT CELLS
    Picture rowPeons = createPeons(8);
    Picture rowPieces = Picture.torre()
        .alLado(Picture.caballo())
        .alLado(Picture.alfil())
        .alLado(Picture.rey())
        .alLado(Picture.dama())
        .alLado(Picture.alfil())
        .alLado(Picture.caballo())
        .alLado(Picture.torre());


    // PAWN AND PIECES LINE WITH CELLS
    Picture cellAndPieces = rowPieces.superponer(rowTable1);
    Picture cellAndPeons = rowPeons.superponer(rowTable2);

    // FIRST AND LAST LINES WITH PIECES
    Picture firstTwoLines = cellAndPieces.encima(cellAndPeons);
    Picture lastTwoLines = cellAndPeons.encima(cellAndPieces).invertir();

    // COMPLETE TABLE
    Picture completeTable = firstTwoLines.encima(voidHalfTable).encima(lastTwoLines);

    // SHOW ON SCREEN
    Graphics display = new Graphics(completeTable);
    display.print();
  }

  public static Picture createPeons(int n) {
    if (n == 1)
      return Picture.peon();
    Picture row = Picture.peon().alLado(createPeons(n - 1));
    return row;
  }
}
