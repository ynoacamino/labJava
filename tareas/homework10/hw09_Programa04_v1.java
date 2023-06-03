//calcula la utilidad de un trabajador segun su tiempo en la empresa
import java.util.*;

public class hw09_Programa04_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double salary = sc.nextDouble();
    int age = (int) sc.nextDouble();

    if(age < 1) {
      System.out.println("La utilidad total es de: " + salary * 1.05);
    } else if(1 <= age && age < 2) {
      System.out.println("La utilidad total es de: " + salary * 1.07);
    } else if(2 <= age && age < 5) {
      System.out.println("La utilidad total es de: " + salary * 1.10);
    } else if(5 <= age && age < 10) {
      System.out.println("La utilidad total es de: " + salary * 1.15);
    } else {
      System.out.println("La utilidad total es de: " + salary * 1.20);
    }
  }
}


