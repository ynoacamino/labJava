//Programa que resive 3 valores y determina si aprobaste
import java.util.*;

class Programa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double num1, num2, num3, average;
    num1 = sc.nextDouble();
    num2 = sc.nextDouble();
    num3 = sc.nextDouble();
    average = (num1 + num2 + num3)/3;

    sc.close();

    if(average >= 13) {
      System.out.println("Aprobaste");
    } else {
      System.out.println("Desaprobaste");
    }
  }
}



