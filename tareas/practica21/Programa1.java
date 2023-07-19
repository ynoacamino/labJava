package tareas.practica21;

import java.util.Scanner;

public class Programa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Alumno yo = new Alumno(18, "Yenaro", 17.5);

    System.out.println(yo);

    yo.setName(sc.nextLine());
    yo.setAge(sc.nextInt());
    yo.setAverage(sc.nextDouble());

    System.out.println(yo);
  }
}
