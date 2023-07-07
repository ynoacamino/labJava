package tareas.homework18;

import java.util.Scanner;

public class Programa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    
    System.out.println(format(a, b));
  }

  public static String format(double a, double b) {
    return "(" + a + ", " + b + ")";
  }
}
