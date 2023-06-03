// Noa Camino Yenaro Joel
// Programa 4
// ingresa un nombre completo y devuelve un monograma

package tareas.homework06;
import java.util.Scanner;

public class Programa4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;

    name = sc.nextLine();
    sc.close();

    int lrg = name.length();

    String first, second, third;

    first = name.substring(0, 1);
    name = name.substring(name.indexOf(" ") +1, lrg);
    second = name.substring(0, 1);
    third = name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2);

    System.out.println(first + second + third);
  }
}


