package exercises;
import java.util.Scanner;

public class condicionals {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    scan.close();
    switch (number) {
      case 1:
        consoleLog("uno");
        break;
      case 2:
        consoleLog("dos");
        break;
      case 3:
        consoleLog("tres");
        break;
      default:
        consoleLog("cualquier otro numero");
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
