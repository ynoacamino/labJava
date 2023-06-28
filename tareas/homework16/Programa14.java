package tareas.homework16;
import java.util.*;

public class Programa14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int total = 0;

    while(true) {
      int precio, cantidad, totalPorProducto;

      System.out.println("Ingrese el precio del producto: ");
      precio = sc.nextInt();
      System.out.println("Ingrese la cantidad: ");
      cantidad = sc.nextInt();

      System.out.println("El producto tiene etiqueta roja? si:1/no:0");
      int redTag = sc.nextInt();
      
      totalPorProducto = precio * cantidad;

      if(redTag == 1) {
        totalPorProducto *= 0.8;
      }
      
      total += totalPorProducto;
      System.out.println("Acumulado: " + total);

      System.out.println("Para dejar de comprar ingrese 0");
      int salir = sc.nextInt();
      if(salir == 0) break;
    }
    System.out.println("Total a pagar en caja: " + total);
  }
}
