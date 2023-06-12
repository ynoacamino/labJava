package tareas.homework12;

import java.util.*;

public class Programa07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numM = sc.nextInt();
    int numN = sc.nextInt();

    int player = sc.nextInt();
    int counter = 1;

    while(!(numM <= player && numN >= player)) {
      player = sc.nextInt();
      counter += 1;
    }

    System.out.println("Intentos: " + counter);
  }
}



