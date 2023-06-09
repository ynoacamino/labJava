package tareas.homework12;
import java.util.*;

public class Programa02_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rango = sc.nextInt();

    int i = 0;
    do {
      System.out.println(num + " * " + i + " = " + num*i);
      i += 1;
    } while(i <= rango);

  }
}
