// Noa Camino Yenaro Joel
// Programa 7
// Invertir el orden de un numero de 3 cifras

package tareas.homework06;
import java.util.Scanner;

public class Programa7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, unit, dec, cen, newNum;

    num = sc.nextInt();
    sc.close();

    cen = num/100;
    dec = num/10 - cen*10;
    unit = num - dec*10 - cen*100;

    newNum = unit*100 + dec*10 + cen;

    System.out.println("El nuevo numero es: " + newNum);
  }
}
