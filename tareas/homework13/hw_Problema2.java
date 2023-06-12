package tareas.homework13;
import java.util.*;

public class hw_Problema2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int max = Math.max(num1, num2);
    int min = Math.min(num1, num2);

    int resto;

    while(true) {
      resto = max % min;
      if(resto == 0) break;
      max = min;
      min = resto;
    }
    System.out.println("El MDC es: " + min);

  }
}

