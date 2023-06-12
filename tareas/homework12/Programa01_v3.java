package tareas.homework12;
// Programa que muestra los n primeros númerosenteros no negativos
import java.util.*;

public class Programa01_v3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for(int i = 1; i <= num; i += 1) {
      System.out.println(i);
    }
  }
}


