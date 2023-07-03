package tareas.homework17;

import java.util.Scanner;

public class Programa2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    if(num1 > 0 && num2 > 0) {
      int factorialNum1 = factorial(num1);
      int factorialNum2 = factorial(num2);

      System.out.println("La multiplicacion de factoriales es: " + (factorialNum1*factorialNum2));
    } else {
      System.out.println("No se puede efectuar el factorial de un numero negativo");
    }
  }

  public static int factorial(int num) {
    int factorial = 1;
    for(int i = num; i > 0; i -= 1) {
      factorial *= i;
    }
    return factorial;
  }
}
