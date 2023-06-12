package tareas.homework12;

//imprime todas la fomas de numero
public class Programa10 {
  public static void main(String[] args) {
    for(int i = 0; i < 2; i += 1) {
      for(int j = 0; j < 2; j += 1) {
        for(int k = 0; k < 2; k += 1) {
          String numBi = "" + i + j + k;
          System.out.println(numBi);
        }
      }
    }
  }
}


