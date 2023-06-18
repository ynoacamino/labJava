package tareas.homework14;
import java.util.*;

public class Hw_Problema4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el numero de alumnos: ");
    int n = sc.nextInt();

    int min = 20;
    int sum = 0;
    
    for(int i = 0; i < n; i += 1) {
      int nota = sc.nextInt();
      sum += nota;
      min = Math.min(min, nota);
    }
    sc.close();
    System.out.println("Nota mas baja: " + min);
    System.out.println("Promedio: " + sum / n);
  }
}


