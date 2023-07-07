package tareas.homework18;

import java.util.Scanner;

public class Programa4_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = sc.nextDouble();

    if(isPar(num)) {
      System.out.println("Es par");
    } else {
      System.out.println("Es impar");
    }
  }

  public static boolean isPar(double num) {
    return num % 2 == 0;
  }
}
