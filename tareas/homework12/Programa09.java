package tareas.homework12;
// Programa que siempre imprime un numero mayor al ingresado
import java.util.*;

public class Programa09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.println("Escriba un numero: ");
      int numPlayer = sc.nextInt();
      System.out.println("La computadora escribe: ");
      System.out.println(numPlayer + 1);
    }
  }
}


