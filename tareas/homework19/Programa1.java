package tareas.homework19;

public class Programa1 {
  public static void main(String[] args) {
    int[] array = {4, 2, 378, 123, 25};

    System.out.println("La suma es: " + sumarArr(array));
  }

  public static int sumarArr(int[] arr) {
    int total = 0;
    for(int i = 0; i < arr.length; i += 1) {
      total += arr[i];
    }
    return total;
  }
}

