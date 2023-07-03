package tareas.homework17;

import java.util.Scanner;

public class Programa3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();

    double restaX = x1 - x2;
    double restaY = y1 - y2;

    double distancia = Math.sqrt(Math.pow(restaX, 2) + Math.pow(restaY, 2));
    System.out.println("La distancia es: " + distancia);
  }
}
