// Noa Camino Yenaro Joel
// Programa 2
// ingresa un nombre completo y devuelve un monograma

package tareas;
import java.util.Scanner;

public class Programa2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name,ap1, ap2;

    name = sc.nextLine();
    ap1 = sc.nextLine();
    ap2 = sc.nextLine();
    sc.close();

    String first, second, third;

    first = name.substring(0, 1);
    second = ap1.substring(0, 1);
    third = ap2.substring(0, 1);

    System.out.println(first + second + third);
  }
}


