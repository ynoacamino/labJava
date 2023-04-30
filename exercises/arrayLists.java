package exercises;
import java.util.ArrayList;

public class arrayLists {
  public static void main(String[] args) {
    ArrayList<String> myArray = new ArrayList<String>();

    myArray.add("3");
    myArray.add("2");
    myArray.add("1");
    
    myArray.forEach(x -> consoleLog(x));
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