package tareas.homework12;
// Muestra un listado con los números del 1 a n
import java.util.*;

public class Programa04_v3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = sc.nextInt();
    int max = sc.nextInt();
    int sum = 0;

    for(int i = min; i <= max; i += 1) {
      sum += i;
    }

    System.out.println(sum);
  }
}


