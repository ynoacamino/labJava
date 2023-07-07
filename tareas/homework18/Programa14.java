package tareas.homework18;

import java.util.Scanner;

public class Programa14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    System.out.println(fibonaci(num));
  }

  public static int fibonaci(int num) {
    if(num == 1) return 0;
    if(num == 2 ) return 1;

    return fibonaci(num - 1) + fibonaci(num - 2);
  }
}
