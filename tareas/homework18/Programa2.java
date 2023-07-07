package tareas.homework18;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println(format(a, b));
  }

  public static String format(int a, int b) {
    if(b == 0) return "" + a;
    if(b == 1) return a + "+i";
    if(b == -1) return a + "-i";
    if(b > 0) return a + "+" + b +"i";
    return a + "" + b +"i";
  }
}


