//Programa que imprime de manera asendente dos numeros ingresados
import java.util.*;

class Programa2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2;
    num1 = sc.nextInt();
    num2 = sc.nextInt();

    if(num1 > num2) {
      System.out.println(num2);
      System.out.println(num1);
    } else {
      System.out.println(num1);
      System.out.println(num2);
    }
  }
}