package tareas.homework16;
import java.util.*;

public class Programa12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese su saldo: ");
    int saldo = sc.nextInt();
    int total = 0;

    while(true) {
      int precio, cantidad;
      do {
        System.out.println("Ingrese el precio del producto: ");
        precio = sc.nextInt();
        System.out.println("Ingrese la cantidad: ");
        cantidad = sc.nextInt();
      } while(precio * cantidad + total > saldo);
      total += precio * cantidad;
      System.out.println("Acumulado: " + total);
      System.out.println("Saldo restante: " + (saldo - total));

      System.out.println("Para dejar de comprar ingrese 0");
      int salir = sc.nextInt();
      if(salir == 0) break;
    }
    System.out.println("Total a pagar en caja: " + total);
  }
}
