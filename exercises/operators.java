package exercises;
import java.util.Scanner;

public class operators {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sold = scan.nextInt();
    scan.close();
    if (sold >= 1000){
      consoleLog("buen sueldo");
    }
    else{
      consoleLog("mal sueldo");
    }
  }
  //ConsoleLog in Java :b
  public static void consoleLog(String imp) {
    System.out.println(imp);
  }
  public static void consoleLog(int imp) {
    System.out.println(imp);
  }
  public static void consoleLog(Boolean imp) {
    System.out.println(imp);
  }
}
