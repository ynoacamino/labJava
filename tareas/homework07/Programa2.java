package tareas.homework07;
//Programa que imprime un numero alreatorio deacuerdo a un numero minimo 
import java.util.*;

public class Programa2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Numero del primer boleto: ");
    int numMin = sc.nextInt();

    System.out.print("Numero de boletos vendidos: ");
    int num = sc.nextInt();
    sc.close();

    System.out.println("Numero ganador: " + (int)(Math.random()*num + numMin));
  }
}


