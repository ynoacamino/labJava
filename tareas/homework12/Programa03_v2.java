package tareas.homework12;
// Muestra los números impares entre m y n enteros
import java.util.*;

public class Programa03_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = sc.nextInt();
    int max = sc.nextInt();

    if(min % 2 == 0) min +=1;

    do {
      System.out.println(min);
      min += 2;
    } while(min <= max);
  }
}


