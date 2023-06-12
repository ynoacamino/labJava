package tareas.homework12;
//Mostrar un listado con los números del 1 a n elevados al cuadrado
import java.util.*;

public class Programa05_v3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for(int i = 0; i <= num; i += 1) {
      System.out.println(i + " ^ " + 2 + " = " + Math.pow(i, 2));
    }
  }
}

