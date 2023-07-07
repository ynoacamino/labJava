package tareas.homework18;

import java.util.Scanner;

public class Programa11_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int pow = sc.nextInt();

    System.out.println("Result is: " + potencia(base, pow));
  }

  public static int potencia(int base, int pow) {
    int result = 1;
    for(int i = 0; i < pow; i += 1) {
      result *= base;
    }
    return result;
  }
}
