// Noa Camino Yenaro Joel
// Programa 7
// Redondear un numero decimal solo con operadores matematico

package tareas.homework06;
import java.util.Scanner;

public class Programa8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = sc.nextDouble();
    sc.close();

    System.out.println(((num*1000)-(num*1000) % (10))/1000);
  }
}
