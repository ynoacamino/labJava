//Esto no hace absolutamente nada
import exercises.Clasees;

public class testingJava {

  public static void main(String[] args) {
    Clasees yo = new Clasees(17, "Yenaro", "Noa");
    consoleLog(yo.getName());
    yo.showDates(); 
    System.out.println("Hola mundo");
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

