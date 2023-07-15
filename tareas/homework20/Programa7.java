package tareas.homework20;

public class Programa7 {
  public static void main(String[] args) {
    int[][] array1 = {{1, 2, 3}, {3, 3, 3}, {4, 4, 4}};
    int[][] array2 = {{3, 2, 1}, {1, 1, 1}, {2, 2, 2}};

    printArray(sumarArrays(array1, array2));
    System.out.println("-------------------------");
    printArray(restarArrays(array1, array2));
    System.out.println("-------------------------");
    printArray(productoPuntoArrays(array1, array2));

  }

  public static int[][] sumarArrays(int[][] arr1, int[][] arr2) {
    int[][] response = new int[arr1.length][arr1[0].length];

    for(int i = 0; i < arr1.length; i += 1) {
      for(int j = 0; j < arr1[0].length; j += 1) {
        response[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    return response;
  }

  public static int[][]  productoPuntoArrays(int[][] arr1, int[][] arr2) {
    int[][] response = new int[arr1.length][arr1[0].length];

    for(int i = 0; i < arr1.length; i += 1) {
      for(int j = 0; j < arr1[0].length; j += 1) {
        response[i][j] = arr1[i][j] * arr2[i][j];
      }
    }

    return response;
  }

  public static int[][]  restarArrays(int[][] arr1, int[][] arr2) {
    int[][] response = new int[arr1.length][arr1[0].length];

    for(int i = 0; i < arr1.length; i += 1) {
      for(int j = 0; j < arr1[0].length; j += 1) {
        response[i][j] = arr1[i][j] - arr2[i][j];
      }
    }

    return response;
  }

  public static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
  }
}
