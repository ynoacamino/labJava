import galapagos.Turtle;

public class PentagonoTurtle {
  public static void main(String[] args) {
    Turtle t1 = new Turtle();
    t1.speed(1000);

    int condicion = 0;
    while(condicion < 5) {
      t1.move(50);
      t1.turn(72);
      condicion++;
    }
  }
}
