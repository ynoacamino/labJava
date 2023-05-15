// Noa Camino Yenaro Joel
// Programa 4
// Imprime el promedio de 5 notas

package tareas;
import java.util.Scanner;

public class Programa5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double capital, interes, monto;

    capital = sc.nextDouble();
    interes = capital*0.02;

    sc.close();

    monto = capital + interes;

    System.out.println("Interes: " + interes);
    System.out.println("Monto final: " + monto);
  }
}
