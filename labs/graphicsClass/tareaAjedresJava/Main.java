import graphics.*;
class Main{
  public static void main(String[] args){
    Picture casilleroNegro = Picture.casilleroBlanco().invertir();
    Graphics g = new Graphics(casilleroNegro);
    g.print();
  }
}
