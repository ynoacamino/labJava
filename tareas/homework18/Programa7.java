package tareas.homework18;

import java.util.Scanner;

public class Programa7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

    System.out.println("El menor es " + menor3(num1, num2, num3));

  }

  public static int menor3(int num1, int num2, int num3) {
    int menor = num1 > num2 ? num2 : num1;
    if(menor > num3) menor = num3;
    return menor;
  }
}
