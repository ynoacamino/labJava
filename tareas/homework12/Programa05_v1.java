package tareas.homework12;
import java.util.*;

public class Programa05_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int i = 0;
    while(i <= num) {
      System.out.println(i + " ^ " + 2 + " = " + Math.pow(i, 2));
      i += 1;
    }
  }
}
