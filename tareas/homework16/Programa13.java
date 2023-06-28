package tareas.homework16;
import java.util.*;

public class Programa13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int favor = 0, contra = 0, noOpina = 0;
    double num = 0;
    
    while(true){
      System.out.println("Ingrese -1:En contra, 0:No opina, 1:A favor, 2:Para terminar");
      int voto = sc.nextInt();
      switch (voto) {
        case -1: contra +=1; break;
        case 0: noOpina +=1; break;
        case 1: favor += 1; break;
      }
      if(voto == 2) break;
      num +=1;
    }

    System.out.println("Procentaje de los que estan en contra: " + contra*100/num );
    System.out.println("Procentaje de los que estan a favor: " + favor*100/num );
    System.out.println("Procentaje de los que no opinan: " + noOpina*100/num );
  }
}
