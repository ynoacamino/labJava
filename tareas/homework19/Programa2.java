package tareas.homework19;

public class Programa2 {
  public static void main(String[] args) {
    int[] firstArray = generar();
    int[] secondArray = generar();

    int[] suma = sumar(firstArray, secondArray);

    imprimir(firstArray, secondArray, suma);
  }

  public static int[] generar() {
    int[] arr = new int[10];
    for(int i = 0; i < 10; i += 1) {
      arr[i] = (int) (Math.random()*20 + 1);
    }
    return arr;
  }

  public static int[] sumar(int[] arr1, int[] arr2) {
    int[] sumaArr = new int[10];
    for(int i = 0; i < 10; i += 1) {
      sumaArr[i] = arr1[i] + arr2[i];
    }
    return sumaArr;
  }

  public static void imprimir(int[] arr1, int[] arr2, int[] arrSuma) {
    for(int i = 0; i < 10; i +=1 ) {
      System.out.println(arr1[i] + " + " + arr2[i] + " = " + arrSuma[i]);
    }
  }
}

