package tareas.homework07;
import java.util.*;

public class Programa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Indique el numero de estudiantes");
    int nro = sc.nextInt();
    sc.close();

    System.out.println("El alumno escogido es: " + (int) (Math.random()*nro +1));
  }
}
