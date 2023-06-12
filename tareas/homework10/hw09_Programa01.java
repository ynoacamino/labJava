//Programa que imprime si aprueba o no
import java.util.*;

public class hw09_Programa01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double notaLab = sc.nextDouble();
    double notaTeo = sc.nextDouble();
    int notaFinal;

    if(notaLab >= 13) {
      notaFinal = (int) (notaTeo * 0.75 + notaLab * 0.25 + 0.5);
      if(notaFinal >= 13){
        System.out.println("El estudiante esta aprobado");
      } else {
        System.out.println("El estudiante esta desaprobado");
      }
      System.out.println("Nota: " + notaFinal);
    } else {
      System.out.println("El estudiante esta desaprobado");
      if(notaTeo >= notaLab) {
        System.out.println("Nota: " + notaLab);
      } else {
        System.out.println("Nota: " + notaTeo);
      }
    }
  }
}

