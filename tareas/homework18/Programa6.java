package tareas.homework18;

import java.util.Scanner;

public class Programa6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("result: " + operation(num1, num2));
  }

  public static double operation(int a, int b) {
    if(b % a == 0) return a * b;
    return a/(b * 1.0);
  }
}
