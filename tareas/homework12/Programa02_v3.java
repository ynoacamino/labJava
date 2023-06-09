package tareas.homework12;
import java.util.*;

public class Programa02_v3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rango = sc.nextInt();

    for(int i = 0; i <= rango; i += 1){
      System.out.println(num + " * " + i + " = " + num*i);
    }
  }
}
