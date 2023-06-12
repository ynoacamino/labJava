package tareas.homework12;
// calcula la sumatoria de los números comprendidos en un rango dado
import java.util.*;

public class Programa04_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = sc.nextInt();
    int max = sc.nextInt();
    int sum = 0;

    do {
      sum += min;
      min += 1; 
    } while(min <= max);

    System.out.println(sum);
  }
}

