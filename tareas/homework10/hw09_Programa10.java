//Programa que efectua una ecuacion
import java.util.*;

public class hw09_Programa10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int nume = (a*d + b*c);
    int deno = b*d;

    if(b == 0 || d == 0) {
      System.out.println("La division no se puede calcular");
    } else if(nume == deno) {
      System.out.println("El resultado es 1");
    } else {
      System.out.println("El resultado es " + nume + "/" + deno);
    }
  }
}


