package tareas.homework20;

public class Programa9 {
  public static void main(String[] args) {
    int[][] arr = {{4, 2, 5}, {7, 1, 5}, {4, 1, 123}};

    printArray(arr);
    printArray(getTranspuesta(arr));
    
  }

  public static int[][] getTranspuesta(int[][] matriz) {
    int rows = matriz.length;
    int columns = matriz[0].length;
    
    int[][] transpuesta = new int[columns][rows];
    
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        transpuesta[j][i] = matriz[i][j];
      }
    }

    return transpuesta;
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
