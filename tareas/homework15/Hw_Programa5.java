package tareas.homework15;
import java.util.*;

public class Hw_Programa5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de numeros a comparar: ");
    int n = sc.nextInt();
    int max = 0;

    for(int i = 0; i < n; i += 1) {
      int num = sc.nextInt();
      max = Math.max(max, num);
    }

    System.out.println("El mayor numero es: " + max);
  }
}


