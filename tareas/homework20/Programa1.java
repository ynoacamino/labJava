package tareas.homework20;
import java.util.*;

public class Programa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] frecuencias = new int[6];
    int n = sc.nextInt();
    
    for(int i = 0; i < n; i += 1) {
      frecuencias[random6() - 1] += 1;
    }

    displayData(frecuencias, n);

    System.out.println("El mayor es: " + (maxIndexArray(frecuencias) + 1));
  }

  public static int random6() {
    return (int) (Math.random() * 6 +1);
  }

  public static int maxIndexArray(int[] arr) {
    int max = 0;
    int index = 0;
    for(int i = 0; i < arr.length; i += 1) {
      if(max < arr[i]) {
        max = arr[i];
        index = i;
      }
    }
    return index;
  }

  public static void displayData(int[] arr, int num ) {
    for(int i = 0; i < arr.length; i += 1) {
      System.out.println("La frecuencia del " + (i+1) + " es: " + (arr[i]) + "/" + num);
    }
  }
}
