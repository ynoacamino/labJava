// Noa Camino Yenaro Joel
// Programa 2
// Imprime el area de un triangulo

package tareas;
import java.util.Scanner;

public class Programa2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double height, base, area;

    base = sc.nextDouble();
    height = sc.nextDouble();
    sc.close();

    area = base*height/2;

    System.out.println("El area es: " + area);
  }
}
