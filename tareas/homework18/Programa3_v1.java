package tareas.homework18;

import java.util.Scanner;

public class Programa3_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    
    System.out.println(hipotenusa(a, b));
  }

  public static double hipotenusa(double a, double b) {
    return Math.sqrt(a*a + b*b);
  }
}
