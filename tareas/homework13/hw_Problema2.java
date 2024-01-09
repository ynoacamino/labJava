package tareas.homework13;
import java.util.*;

public class hw_Problema2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int max;
    int min;

    if(num1> num2 ) {
      max = num1;
      min = num2;
    } else {
      min = num1;
      max = num2;
    }
    int x;
    while(true) {
      x = max % min;
      if(x == 0) {
        break;
      }
      max = min;
      min = x;
    }
    System.out.println(min);
  }
}

