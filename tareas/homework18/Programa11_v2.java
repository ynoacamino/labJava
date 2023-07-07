package tareas.homework18;

import java.util.Scanner;

public class Programa11_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int pow = sc.nextInt();

    System.out.println("Result is: " + potencia(base, pow));
  }

  public static int potencia(int base, int pow) {
    if(pow == 0) return 1;

    return base*potencia(base, pow-1);
  }
}
