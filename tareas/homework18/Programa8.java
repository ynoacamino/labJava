package tareas.homework18;

import java.util.Scanner;

public class Programa8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt(), num4 = sc.nextInt(), num5 = sc.nextInt();

    System.out.println("El menor de 5 es: " + menor3(num1, num2, menor3(num3, num4, num5)));
  }
  
  public static int menor3(int num1, int num2, int num3) {
    int menor = num1 > num2 ? num2 : num1;
    if(menor > num3) menor = num3;
    return menor;
  }
}
