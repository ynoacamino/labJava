package tareas.homework14;
import java.util.*;

public class Hw_Problema1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    while(num1 <= num2){
      if(num1 % 5 == 0) {
        System.out.println(num1);
      }
      num1 += 1;
    }

  }
}

