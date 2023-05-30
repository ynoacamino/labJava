//imprime los operadores que den verdadero segun los dos numeros ingresados
import java.util.*;

class Programa3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2;
    num1 = sc.nextInt();
    num2 = sc.nextInt();

    sc.close();

    if(num1 == num2) {
      System.out.println(" = ");
      System.out.println(" <= ");
      System.out.println(" >= ");
    } else {
      System.out.println(" != ");
      if(num1 > num2) {
        System.out.println(" > ");
      } else {
        System.out.println(" < ");
      }
    }
  }
}
