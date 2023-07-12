package graphicsClass;

import graphics.Graphics;
import graphics.Picture;

public class EjercicioTest {
  public static void main(String[] args) {
    Picture cellWhite = Picture.casilleroBlanco();
    Picture cellBlack = cellWhite.invertir();

    Picture patron = cellWhite.alLado(cellBlack);

    Graphics display = new Graphics(patron);
    display.print();
  }
}
