package exercises;

public class metodos {
  public static void main(String[] args) {
    consoleLog(subtract(2, 4));
    consoleLog(subtract(7, 2));
    consoleLog(mayor(1, 4));
    consoleLog("el 4 es mayor que el 10? " + mayorBoolean(4, 10));
    consoleLog(mayorNums(1, 2, 3, 4));
  }
  
  //Devuelve el mayot de cuatro numeros
  public static int mayorNums(int num1, int num2, int num3, int num4) {
    int arrayArg[] = {num1, num2, num3, num4};
    for(int i = 0; i <= 4; i++) {
      if(mayorBoolean(arrayArg[i], num1)
        && mayorBoolean(arrayArg[i], num2)
        && mayorBoolean(arrayArg[i], num3)
        && mayorBoolean(arrayArg[i], num4)
      ) return arrayArg[i];
    }
    return 0;
  }
  //Devuelve int de la resta de dos numero de manera positiva
  public static int subtract(int num1, int num2) {
    if (num1 >= num2) {
      return num1 - num2;
    } else {
      return num2 - num1;
    }
  }
  //Devuelve el mayor de dos numero ingresados
  public static int mayor(int num1, int num2){
    if(num1 >= num2) return num1;
    else return num2;
  }
  //Devuelve True si el primer arguemnto es mayor que el primero
  public static boolean mayorBoolean(int mayor, int menor) {
    if(mayor >= menor) return true;
    else return false;
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
