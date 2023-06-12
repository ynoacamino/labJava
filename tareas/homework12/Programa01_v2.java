package tareas.homework12;
// Programa que muestra los n primeros númerosenteros no negativos
import java.util.*;

public class Programa01_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int i = 1;
    do {
      System.out.println(i);
      i += 1;
    } while( i <= num);
  }
}


