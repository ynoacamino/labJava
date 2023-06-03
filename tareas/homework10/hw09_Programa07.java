
//Programa que represanta una nota numerica en una oracion
import java.util.*;

public class hw09_Programa07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double nota = sc.nextDouble();

    if(nota >= 0.0 && nota < 5) System.out.println("Repite el semestre");
    else if(nota >= 5 && nota < 10.5) System.out.println("Pasa la subsanacion");
    else if(nota >= 10.5 && nota < 16) System.out.println("Aprobado");
    else if(nota >= 16 && nota <= 20) System.out.println("Aprobado con distincion maxima");
  }
}
