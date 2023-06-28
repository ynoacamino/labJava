package tareas.homework16;
import java.util.*;

public class Programa10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int average = 0;
    int n = sc.nextInt();

    for(int i = 0; i < n; i += 1) {
      System.out.println("Ingrese la nota: ");
      int nota;
      do {
        nota = sc.nextInt();
      } while (nota > 20 || nota < 0);
      average += nota;
    }

    System.out.println("El promedio del grupo es: " + (int)(average/n));
    if(average / n > 10.5) System.out.println("Aprobo"); 
    else System.out.println("Desaprobo");
  }
}
