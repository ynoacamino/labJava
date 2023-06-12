package tareas.homework12;
//Mostrar un listado con los números del 1 a n elevados al cuadrado
import java.util.*;

public class Programa05_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int i = 0;
    do {
      System.out.println(i + " ^ " + 2 + " = " + Math.pow(i, 2));
      i += 1;
    } while(i <= num);
  }
}


