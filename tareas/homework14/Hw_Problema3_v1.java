package tareas.homework14;
import java.util.*;

public class Hw_Problema3_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min, max, intentos = 0;

    do {
      System.out.println("Ingresa el menor numero");
      min = sc.nextInt();
      System.out.println("Ingresa el mayor numero");
      max = sc.nextInt();
    } while(min > max);

    System.out.println("Ingresa un numero dentro del rango indicado: ");
    while(true) {
      intentos += 1;
      int num = sc.nextInt();
      if(num <= max && num >= min) break;
    }

    System.out.println("Intentos: " + intentos);
  }
}
