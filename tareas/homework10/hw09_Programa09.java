//Programa que indica si un año es bisiesto
import java.util.*;

public class hw09_Programa09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();

    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      System.out.println("Si es un año bisiesto");
    } else {
      System.out.println("No es un año bisiesto");
    }
  }
}

