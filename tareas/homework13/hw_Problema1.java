package tareas.homework13;
import java.util.*;

public class hw_Problema1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Precio de tela: ");
    final int PRECIO = sc.nextInt();

    System.out.println("\t5\t10\t15\t20\t25");

    for(int i = 11; i <= 20; i += 1) {
      System.out.print(i + "\t");
      for(int j = 5; j <= 25; j += 5) {
        System.out.print(i*j*PRECIO + "\t");
      }
      System.out.println();
    }
  }
}




