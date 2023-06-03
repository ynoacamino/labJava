import galapagos.Turtle;
import java.util.*;

public class PoligonoTurtle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Turtle t1 = new Turtle();
    t1.speed(1000);

    int lados = sc.nextInt();
    int condicion = 0;
    int angle = 180 - (lados - 2) * 180 / lados;

    while(condicion < lados) {
      t1.move(50);
      t1.turn(angle);
      condicion++;
    }
  }
}
