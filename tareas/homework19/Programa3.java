package tareas.homework19;
import java.util.*;

public class Programa3 {
  public static void main(String[] args) {
    int[] myArray = new int[7];
    myArray = ingresar(myArray);

    int[] myModifiedArray = modificar(myArray);

    System.out.println("------------------------");

    imprimir(myModifiedArray);
  }
  public static int[] ingresar(int[] arr) {
    Scanner sc = new Scanner(System.in);
    int[] newArr = new int[arr.length];
    for(int i = 0; i < arr.length; i +=1 ) {
      newArr[i] = sc.nextInt();
    }
    return newArr;
  }
  public static int[] modificar(int[] arr) {
    int[] newArr = new int[arr.length];

    for(int i = 0; i < arr.length; i += 1) {
      newArr[i] = arr[i] * 2;
    }

    return newArr;
  }
  public static void imprimir(int[] arr) {
    for(int e: arr) {
      System.out.println(e);
    }
  }
}
