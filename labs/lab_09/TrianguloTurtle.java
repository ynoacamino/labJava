import galapagos.Turtle;

public class TrianguloTurtle {
  public static void main(String[] args) {
    Turtle t1 = new Turtle();
    t1.speed(1000);
    
    int condicion = 0;
    while(condicion < 3) {
      t1.move(30);
      t1.turn(120);
      condicion++;
    }

  }
}
