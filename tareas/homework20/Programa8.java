package tareas.homework20;
import java.util.Scanner;

public class Programa8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el tamano del array");
    int n = sc.nextInt();

    int[][] arr = new int[n][n];
    
    for(int i = 0; i < n; i += 1) {
      for(int j = 0; j < n; j += 1) {
        if(i == j) {
          arr[i][j] = 1;
        } else {
          arr[i][j] = 0;
        }
      }
    }

    printArray(arr);
  }

  public static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("-------------------------");
  }
}
