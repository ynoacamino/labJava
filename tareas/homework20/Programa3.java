package tareas.homework20;
import java.util.Scanner;

public class Programa3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] frecuencias = new int[20];

    for(int i = 0; i < n; i += 1) {
      frecuencias[random(20) -1] += 1;
    }

    System.out.println("La nota con menor frecuencia es:" + (minIndexArray(frecuencias) + 1));
    System.out.println("La nota con mayor frecuencia es:" + (maxIndexArray(frecuencias) + 1));

    System.out.println("Grafico:");
    displayHistogram(frecuencias, n);

  }

  public static int random(int i) {
    return (int) (Math.random() * i +1);
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

  public static int minIndexArray(int[] arr) {
    int min = 20;
    int index = 0;
    for(int i = 0; i < arr.length; i += 1) {
      if(min > arr[i]) {
        min = arr[i];
        index = i;
      }
    }
    return index;
  }

  public static void displayHistogram(int[] arr, int n) {
    for(int i = 0; i < arr.length; i += 1) {
      System.out.println("Nota " + (i + 1) + " : " + generateBar(arr[i], n));
    }
  }

  public static String generateBar(int ind, int total) {
    String bar = "";
    int length = (int) (ind * 1000/total);
    for(int i = 0; i < length; i +=1) {
      bar += "*";
    }
    return bar;
  }
}
