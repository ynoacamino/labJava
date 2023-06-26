package tareas.homework16;
import java.util.*;

public class Programa11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int num = sc.nextInt();
      int divisores = 0;
      for(int i = 1; i <= num; i +=1 ) {
        if(num % i == 0) {
          divisores += 1;
          System.out.println(i);
        }
      }
      System.out.println("el numero de divisores es: " + divisores);
      
      System.out.println("Desea continuar con otro numero?, ingrese 1");
      int continuar = sc.nextInt();
      if(continuar == 1) continue;
      break;
    }
  }
}
