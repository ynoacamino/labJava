package tareas.homework20;
import java.util.*;

public class Programa4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] notas = new int[10];
    
    for(int i = 0; i < 10; i += 1) {
      notas[i] = sc.nextInt();

      while(notas[i] > 5 || notas[i] < 1) {
        System.out.println("La nota debe estar entre 1 y 5");
        notas[i] = sc.nextInt();
      }
    }
    displayArray(notas);
    displayHistogram(notas, 10);
  }

  public static void displayArray(int[] arr) {
    String firstRow = "[";
    for(int i = 0; i < arr.length /2; i += 1) {
      firstRow += arr[i] + ", ";
    }
    firstRow += "]";

    String secondRow = "[";
    for(int i = arr.length /2; i < arr.length; i += 1) {
      secondRow += arr[i] + ", ";
    }
    secondRow += "]";

    System.out.println(firstRow + "\n" + secondRow);
  }

  public static void displayHistogram(int[] arr, int n) {
    for(int i = 0; i < arr.length; i += 1) {
      System.out.println("Nota " + (i + 1) + " : " + generateBar(arr[i], n));
    }
  }

  public static String generateBar(int ind, int total) {
    String bar = "";
    int length = (int) (ind * total/5);
    for(int i = 0; i < length; i +=1) {
      bar += "*";
    }
    return bar;
  }
}
