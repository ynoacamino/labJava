package tareas.homework15;

public class Hw_Programa6 {
  public static void main(String[] args) {
    for(int h = 0; h < 24; h += 1) {
      for(int m = 0; m < 60; m += 1) {
        for(int s = 0; s < 60; s += 1) {
          System.out.println(h + " : " + m + " : " + s);
        }
      }
    }
  }
}



