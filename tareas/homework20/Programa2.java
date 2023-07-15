package tareas.homework20;
import java.util.Scanner;

public class Programa2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] frecuencias = new int[11];

    for(int i = 0; i < n; i += 1) {
      frecuencias[random6() + random6() -2] += 1;
    }

    displayData(frecuencias, n);
  }

  public static void displayData(int[] arr, int num ) {
    for(int i = 0; i < arr.length; i += 1) {
      System.out.println((i+2) + " tiene una frecuencia de: " + arr[i] + "/" + num);
    }
  }

  public static int random6() {
    return (int) (Math.random() * 6 +1);
  }
}
