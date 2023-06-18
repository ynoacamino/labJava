package tareas.homework14;
import java.util.*;

public class Hw_Problema2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int positivos = 0;
    int negativos = 0;


    while(true) {
      int num = sc.nextInt();
      if( num == 0 ) break;
      if( num > 0) positivos += 1;
      else negativos += 1;
    }
    sc.close();

    System.out.println("Positivos: " + positivos);
    System.out.println("Negativos : " + negativos);

  }
}
