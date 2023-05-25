package tareas.homework08;
import java.util.*;

public class Programa2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese su sueldo base");
    double sueldo = sc.nextInt();
    sc.close();
    
    if(sueldo < 1000) {
      sueldo = sueldo*1.2;
    } else {
      sueldo = sueldo*1.1;
    }

    System.out.println("Su sueldo final es: " + sueldo);
  }
}

