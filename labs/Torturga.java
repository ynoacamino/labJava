import galapagos.*;
import java.util.*;

public class Torturga {
  public static void main(String[] args) {
    Turtle t1 = new Turtle();
    t1.speed(500);

    Scanner sc = new Scanner(System.in);

    int poli = sc.nextInt();
    
    int angle = 180 - (poli - 2)*180/poli;

    int cicleWhile = 0;
    while( cicleWhile < poli) {
      t1.move(50);
      t1.turn(angle);
      cicleWhile++;
    }
  }
  
  public static void newSquare(Turtle myTortuga, int length) {
    int cicle = 0;
    while(cicle < 4) {
      myTortuga.move(length);
      myTortuga.turn(90);
      cicle += 1;
    }
  }
}
