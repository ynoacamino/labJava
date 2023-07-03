package tareas.concurso;
import java.util.Scanner;

public class Programa3 {
  public static int saveMemory(int num, String str){
    int suma = 1;

    for(int i = 0; i < num; i += 1) {
      int sumNumbers = 0;
      for(int j = 0; j < str.length()/num; j += 1) {
        int letterToNumber = str.charAt(i + num*j) - 'A' + 1;
        sumNumbers += letterToNumber;
      }
      suma *= sumNumbers % 10 + 1;
    }
    return (suma % 10) + 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final int num1 = sc.nextLine().charAt(2) - 48;
    final String str1 = sc.nextLine().toUpperCase();

    final int num2 = sc.nextLine().charAt(2) - 48;
    final String str2 = sc.nextLine().toUpperCase();

    sc.close();

    final int numRpta = saveMemory(num1, str1);

    final int letterRpta = saveMemory(num2, str2);

    System.out.println(numRpta + "-" + (char) ('A' + letterRpta - 1));
  }
}
