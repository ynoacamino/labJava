// Noa Camino Yenaro Joel
// Programa 6
// Calcula el monto y final y las comisiones por ventas

package tareas.homework06;
import java.util.Scanner;

public class Programa6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sueldo, venta1, venta2, comision, monto;

    sueldo = sc.nextDouble();
    venta1 = sc.nextDouble();
    venta2 = sc.nextDouble();
    sc.close();

    comision = venta1*0.1 + venta2*0.1;
    monto = sueldo + comision;

    System.out.println("Comision: " + comision);
    System.out.println("Monto final: " + monto);
  }
}
