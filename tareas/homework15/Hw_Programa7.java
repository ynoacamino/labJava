package tareas.homework15;
import java.util.*;

public class Hw_Programa7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa los numeros acontinuacion, ");
    System.out.println("para terminar coloca 'salir'");

    int positivo = 0, negativo = 0, cero = 0;

    while(true) {
      String user = sc.next();
      if(user.equals("salir")) break;
      
      int num = Integer.parseInt(user);

      if(num == 0) cero += 1;
      else if (num < 0) negativo += 1;
      else positivo += 1;
    }

    System.out.println("Numero de positvos: " + positivo);
    System.out.println("Numero de negativos: " + negativo);
    System.out.println("Numero de ceros: " + cero);
  }
}
