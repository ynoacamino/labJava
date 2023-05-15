// Noa Camino Yenaro Joel
// Programa 3
// Imprime la conversion de pulgadas a cm

package tareas;
import java.util.Scanner;

public class Programa3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double inch, cm;

    inch = sc.nextDouble();
    sc.close();

    cm = inch*2.54;

    System.out.println(inch + " pulgadas en cm es : " + cm);
  }
}
