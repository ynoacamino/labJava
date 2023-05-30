//Programa que te dice si invertir o no
import java.util.*;

class Programa4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double capital, tasa, interes;
    capital = sc.nextDouble();
    tasa = sc.nextDouble()/100;
    interes = capital * tasa;

    sc.close();

    if(interes > 200) {
      System.out.println("Si debes invertir");
      System.out.println("El monto final sera de: " + (capital + interes));
    } else {
      System.out.println("No debes invertir");
    }
  }
}

