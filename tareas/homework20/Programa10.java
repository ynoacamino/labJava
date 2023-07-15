package tareas.homework20;

public class Programa10 {
  public static void main(String[] args) {
    int [][] arr1 = {{1, 2, 3}, {3, 2, 1}, {5, 5, 5}};
    int [][] arr2 = {{5, 5, 1}, {2, 7, 2}, {7, 2, 1}};

    printArray(arr1);
    printArray(arr1);
    multiplicarArrays(arr1, arr2);
  }
  public static void multiplicarArrays(int[][] arr1, int[][] arr2) {
    int filas1 = arr1.length;
    int columnas1 = arr1[0].length;
    int filas2 = arr2.length;
    int columnas2 = arr2[0].length;

    if (columnas1 != filas2) {
        System.out.println("No se puede realizar la multiplicación de matrices.");
        return;
    }

    int[][] arr = new int[filas1][columnas2];

    for (int i = 0; i < filas1; i++) {
      for (int j = 0; j < columnas2; j++) {
        int suma = 0;
        for (int k = 0; k < columnas1; k++) {
          suma += arr1[i][k] * arr2[k][j];
        }
        arr[i][j] = suma;
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
