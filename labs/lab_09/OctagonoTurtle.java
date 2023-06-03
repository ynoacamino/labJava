import galapagos.Turtle;

public class OctagonoTurtle {
  public static void main(String[] args) {
    Turtle t1 = new Turtle();
    t1.speed(1000);

    int condicion = 0;
    while(condicion < 8) {
      t1.move(40);
      t1.turn(45);
      condicion++;
    }
  }
}
