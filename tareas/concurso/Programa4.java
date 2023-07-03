package tareas.concurso;
import java.util.*;

public class Programa4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int max = 0;
    for(int i = 0; i < num; i += 1) {
      max = Math.max(max, sc.nextInt());
    }
    if(max % 2 ==0) {
      System.out.println("hawaiiana");
    } else {
      System.out.println("pepperoni");
    }
  }
}
