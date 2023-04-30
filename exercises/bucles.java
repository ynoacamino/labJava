package exercises;

public class bucles {
  public static void main(String[] args) {
    //TEORIA
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

    //EJERCICIOS

    //Imprima los multiplos del 9 hasta el 12vo
    for(int i = 1; i <= 12; i++) {
      consoleLog(i * 9);
    }
    //Imprima que numeros entre el 30 y 50 son divisibles entre 3
    for(int i = 30; i <= 50; i++) {
      if(i % 3 == 0) consoleLog(i);
    }
    //EJERCICIO MAS INTERESANTE: SIMULAR UN RELOJ ------------------------------
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
