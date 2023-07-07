package graphicsClass;

import graphics.Graphics;
import graphics.Picture;

public class EjercicioTest {
  public static void main(String[] args) {
    Picture cuadroBlanco = Picture.casilleroBlanco();
    Picture cuadroNegro = Picture.casilleroBlanco().invertir();

    Picture patron = cuadroNegro.alLado(cuadroBlanco);

    Picture filaCasillas = patron.repetirH(4);

    Picture primeras3lineas = Picture.torre().alLado(Picture.caballo()).alLado(Picture.alfil());


    Graphics display = new Graphics(primeras3lineas);
    display.print();
  }
}
