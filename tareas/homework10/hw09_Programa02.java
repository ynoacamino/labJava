//Programa que hace operacion dependiendo de dos numeros
import java.util.*;

public class hw09_Programa02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    
    if(num1 == num2) {
      System.out.println(num1 * num2);
    } else if(num1 > num2) {
      System.out.println(num1 - num2);
    } else {
      System.out.println(num1 + num2);
    }
  }
}

