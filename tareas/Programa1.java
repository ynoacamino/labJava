// Noa Camino Yenaro Joel
// Programa 1
// Pide un numero y devuelve un codigo con la primera y ultima letra

package tareas;
import java.util.Scanner;

public class Programa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name, codigo;

    name = sc.next();

    int lrg = name.length();

    sc.close();

    codigo = name.substring(0, 1) + name.substring(lrg-1, lrg) + name.indexOf("a");

    System.out.println(codigo);
  }
}



