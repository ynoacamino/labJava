package tareas.concurso;
import java.util.Scanner;

public class Programa6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String msg = sc.nextLine();

    boolean err = false;
    for(int i = 0; i < msg.length(); i += 1) {
      if(msg.charAt(i) != '1' && msg.charAt(i) != '0') {
        err = true;
      }
    }

    System.out.println(err ? 10101 : msg);
  }
}
