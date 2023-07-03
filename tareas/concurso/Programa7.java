package tareas.concurso;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String text = sc.nextLine();
    String patron = sc.nextLine();
    int patronLength = patron.length();

    ArrayList<Integer> positions = new ArrayList<>();

    for(int i = text.length() - 1; i >= patronLength; i -= 1) {
      if(text.charAt(i) == patron.charAt(patronLength -1)) {
        if(text.substring(i - patronLength + 1, i + 1).equals(patron)) {
          positions.add(i - patronLength + 2);
        }
      }
    }

    for( int i = positions.size() -1; i >= 0; i -= 1) {
      System.out.println(positions.get(i));
    }
  }
}
