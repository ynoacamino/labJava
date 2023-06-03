//imprime el valor de la compra despues del descuento
import java.util.*;
//imprime el valor de la compra despues del descuento
public class hw09_Programa05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String color = sc.nextLine();
    double cost = sc.nextDouble();

    if(color.equals("blanco")) {
      System.out.println("Precio: " + cost);
    }
    if(color.equals("verde")) {
      System.out.println("Precio: " + cost * 0.9);
    }
    if(color.equals("amarillo")) {
      System.out.println("Precio: " + cost * 0.75);
    }
    if(color.equals("azul")) {
      System.out.println("Precio: " + cost * 0.50);
    }
    if(color.equals("rojo")) {
      System.out.println("Precio: " + cost * 0.0);
    }
  }
}

