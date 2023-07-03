package tareas.concurso;

import java.util.Scanner;

public class Programa5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String number = sc.nextLine();

    int numOne = 0;
    for(int i = 0; i < number.length(); i += 1) {
      int bit = number.charAt(i) - 48;
      if(bit == 1) numOne += 1;
    }

    if( numOne % 2 == 0) {
      System.out.println(number + "0");
    } else {
      System.out.println(number + "1"); 
    }
  }
}
