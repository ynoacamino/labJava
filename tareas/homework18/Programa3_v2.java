package tareas.homework18;

import java.util.Scanner;

public class Programa3_v2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    
    displayHipotenusa(a, b);
  }

  public static void displayHipotenusa(double a, double b) {
    System.out.println(Math.sqrt(a*a + b*b));
  }
}
