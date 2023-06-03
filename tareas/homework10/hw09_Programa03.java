//imprime el mayor de cuatro numeros
import java.util.*;

public class hw09_Programa03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    int max;

    if(num1 > num2) {
      max = num1;
    } else {
      max = num2;
    }

    if(num3 > max) {
      max = num3;
    }
    if(num4 > max) {
      max = num4;
    }

    System.out.println("Mayor :" + max);
  }
}
