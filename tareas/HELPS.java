package tareas;
import java.util.*;

public class HELPS{
  public static void main(String[] args) {
    Scanner scan = new Scanner ( System.in); System.out.print ( "Ingrese su primer nombre ");

    String nombre = scan.nextLine();
    System.out.print ("Ingrese su primer apellido ");
    String apl = scan.nextLine();
    System.out.print ("Ingrese su segundo apellido ");
    String ap2 = scan.nextLine();

    scan.close();

    String tl = nombre.substring (0, 1);
    String t2 = apl.substring (0, 1);
    String t3 = ap2.substring (0, 1);

    System.out.println("El Monograma es "+tl+t2+t3);
  }
}

