//Programa que dice si un estudiante apreba o no
import java.util.*;

class Programa5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double teo, lab;
    teo = sc.nextDouble();
    lab = sc.nextDouble();

    if(teo >= 11 && lab >= 11) {
      System.out.println("Aprueba");
      System.out.println((teo*75 + lab*25)/100);
    } else {
      System.out.println("No aprueba");
      if(teo > lab) {
        System.out.println(lab);
      } else {
        System.out.println(teo);
      }
    }
  }
}