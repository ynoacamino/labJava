package tareas.homework13;
import java.util.*;

public class hw_Problema2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int a;
    int b;

    if(num1> num2 ) {
      a = num1;
      b = num2;
    } else {
      b = num1;
      a = num2;
    }
    int x;
    while(true) {
      x = a % b;
      if(x == 0) {
        break;
      }
      a = b;
      b = x;
    }
    System.out.println(b);
  }
}

