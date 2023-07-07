package tareas.homework18;

import java.util.Scanner;

public class Programa13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    System.out.println(fibonaci(num));
  }

  public static int fibonaci(int num) {
    int prevPreventNum = 0;
    int preventNum = 1;

    if(num == 1) return 0;
    if(num == 2) return 1;

    for(int i = 0; i < num - 2; i += 1) {
      int curretNum = prevPreventNum + preventNum;
      prevPreventNum = preventNum;
      preventNum = curretNum;
    }
    return preventNum;
  }
}
