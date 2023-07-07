package tareas.homework18;

import java.util.Scanner;

public class Programa5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      double num = sc.nextDouble();
      if(num == 0) break;
      System.out.println(Math.round(num));
    }
  }
}

