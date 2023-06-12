package tareas.homework12;
// Calcula la suma de los números pares positivos hasta n inclusive
import java.util.*;

public class Programa06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int suma = 0;
    int i = 0;
    while(i <= num) {
      suma += i;
      i += 2;
    }

    System.out.println(suma);
  }
}


