package tareas.concurso;
import java.util.*;

public class Programa1 {
  public static int converter(String letter) {
    if(letter.equals("1")) return 1;
    if(letter.equals("2")) return 2;
    if(letter.equals("3")) return 3;
    if(letter.equals("4")) return 4;
    if(letter.equals("5")) return 5;
    if(letter.equals("6")) return 6;
    if(letter.equals("7")) return 7;
    if(letter.equals("8")) return 8;
    if(letter.equals("9")) return 9;
    if(letter.equals("0")) return 0;
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String cadena = sc.nextLine();
    int sum = 0;

    for(int i = 0; i < cadena.length(); i += 1) {
      String letter = cadena.substring(i, i+1);
      int letterConv = converter(letter);
      if(letterConv != -1) {
        sum += letterConv;
      }
    }
    System.out.println(sum);
  }
}
