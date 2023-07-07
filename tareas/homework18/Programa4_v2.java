package tareas.homework18;

import java.util.Scanner;

public class Programa4_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = sc.nextDouble();

    isPar(num);
  }

  public static void isPar(double num) {
    if(num % 2 == 0) {
      System.out.println("Es par");
    } else {
      System.out.println("Es impar");
    }
  }
}
