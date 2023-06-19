package tareas.homework15;

import java.util.Scanner;

public class Hw_Programa9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int masculino = 0, femenino = 0, total = 0;

    while(true) {
      System.out.println("Ingrese 'm' si es masculino, 'f' si es femenino y 's' para salir");
      String user = sc.next();
      if(user.equals("s")) break;

      if(user.equals("f")) femenino += 1;
      if(user.equals("m")) masculino += 1;

      total += 1;
    }

    System.out.println("Numero de hombes: " + masculino);
    System.out.println("Numero de mujeres: " + femenino);
    System.out.println("Porcentaje de hombres: " + (masculino*100 / total ));
    System.out.println("Porcentaje de mujeres: " + (femenino*100 / total ));
  }
}


