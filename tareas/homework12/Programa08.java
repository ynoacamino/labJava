package tareas.homework12;
//pormedio de una cantidad no limitada
import java.util.*;

public class Programa08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int numNotas = 0;

    while(true) {
      int nota = sc.nextInt();
      if(nota == -1) break;
      
      sum += nota;
      numNotas += 1;
    }
    int average = sum / numNotas;
    System.out.println(average);
  }
}


