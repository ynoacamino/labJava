package tareas.homework18;

import java.util.Scanner;

public class Programa9 {
  public static void main(String[] args) {
    System.out.println("Introdusca dos numeros");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("Tu numero al azar es: " + random(num1, num2));
  }

  public static int random(int num1, int num2) {
    int min = Math.min(num1, num2);
    int max = Math.max(num1, num2);

    return (int) (Math.random()*(max-min) + min) ;
  }
}
