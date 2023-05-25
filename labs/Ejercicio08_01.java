// NOA CAMINO, Yenaro Joel
import java.util.*;

class Ejercicio08_01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Numero de puntos: ");
    int num = sc.nextInt();

    System.out.print("Es fin de semana?: ");
    boolean goodDay = sc.nextBoolean();

    if(goodDay) {
      if(num >= 50) {
        System.out.println("Fue un buen dia");
      } else {
        System.out.println("Fue un mal dia");
      }
    }else {
      if(num >= 50 && num <=70) {
        System.out.println("Fue un buen dia");
      } else {
        System.out.println("Fue un mal dia");
      }
    }

  }
}