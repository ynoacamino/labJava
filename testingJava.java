import java.util.*;
//Esto no hace absolutamente nada
public class testingJava {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.close();
    /*int sold = scan.nextInt();
    scan.close();
    if (sold >= 1000){
      consoleLog("buen sueldo");
    }
    else{
      consoleLog("mal sueldo");
    }
    consoleLog("nueva pruerba"); 
    consoleLog("--------------------------");
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
    consoleLog(subtract(2, 4));
    consoleLog(subtract(7, 2));
    
    int numWhile = 1;
    while (numWhile <= 10) {
      consoleLog(numWhile);
      numWhile += 1;
    }
    
    for (int num = 1; num <= 10; num++) {
      consoleLog(num);
    }
    
    int num = 1;
    do {
      consoleLog(num);
      num += 1;
    }
    while (num <= 10);
    
    //EJERCICIO PARA BUBLES
    for(int i = 1; i <= 12; i++) {
      consoleLog(i * 9);
    }
    
    consoleLog("--------------------");

    for(int i = 30; i <= 50; i++) {
      if(i % 3 == 0) consoleLog(i);
    }
    */
    //EJERCICIO MAS INTERESANTE: SIMULAR UN RELOJ
    consoleLog("inicializa el reloj");
    for(int segs = 0, min = 0, hours = 0; segs != 59 || min != 59 || hours != 23; segs++) {
      if(segs == 60) {
        segs = 0;
        min += 1;
      }
      if(min == 60) {
        min = 0;
        hours += 1;
      }
      String timer = "";
      timer = timer + hours + " : " + min + " : " + segs;
      consoleLog(timer);
    }
    consoleLog("Termino el dia, son las: 23:59:59");
  }
  public static void consoleLog(String imp) {
    System.out.println(imp);
  }
  public static void consoleLog(int imp) {
    System.out.println(imp);
  }
  public static int subtract(int num1, int num2) {
    if (num1 > num2) {
      return num1 - num2;
    } else {
      return num2 - num1;
    }
  }
}
