//calcula la utilidad de un trabajador segun su tiempo en la empresa
import java.util.*;
//calcula la utilidad de un trabajador segun su tiempo en la empresa
public class hw09_Programa04_v2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salary = sc.nextDouble();
    int age = (int) sc.nextDouble();

    switch(age) {
      case 0:
        System.out.println("La utilidad total es de: " + salary * 1.05);
        break;
      case 1:
        System.out.println("La utilidad total es de: " + salary * 1.07);
        break;
      case 2:
      case 3:
      case 4:
        System.out.println("La utilidad total es de: " + salary * 1.10);
        break;
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
        System.out.println("La utilidad total es de: " + salary * 1.15);
        break;
      case 10:
      default:
        System.out.println("La utilidad total es de: " + salary * 1.20);
        break;
    }
  }
}


