// Noa Camino Yenaro Joel
// Programa 4
// Imprime el promedio de 5 notas

package tareas;
import java.util.Scanner;

public class Programa4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nt1, nt2, nt3, nt4, nt5, average;

    nt1 = sc.nextDouble();
    nt2 = sc.nextDouble();
    nt3 = sc.nextDouble();
    nt4 = sc.nextDouble();
    nt5 = sc.nextDouble();
    sc.close();

    average = (nt1+nt2+nt3+nt4+nt5)/5;

    System.out.println("El promedio es: " + average);
  }
}
