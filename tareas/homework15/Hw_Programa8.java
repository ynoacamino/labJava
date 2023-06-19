package tareas.homework15;
import java.util.Scanner;

public class Hw_Programa8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el numero de carros:");
    int n = sc.nextInt();
    int min = 100, max = 0, sum = 0;

    for(int i = 0; i < n; i += 1) {
      int num = sc.nextInt();
      min = Math.min(min, num);
      max = Math.max(max, num);
      sum += num;
    }

    System.out.println("El mayor tiene el puntaje de: " + max);
    System.out.println("El menor tiene el puntaje de: " + min);
    System.out.println("El promedio es: " + (sum / n));
  }
}



