package tareas.concurso;
import java.util.Scanner;

public class Main {
  public static int converter(char letter) {
    if(letter == 'I') return 1;
    if(letter == 'V') return 5;
    if(letter == 'X') return 10;
    if(letter == 'L') return 50;
    if(letter == 'C') return 100;
    if(letter == 'D') return 500;
    if(letter == 'M') return 1000;
    return 3;
  }

  public static int numberDecimal(String romanNumber) {
    int decimalNumber = 0;
    int preValue = 0;
    for (int i = romanNumber.length() - 1; i >= 0; i--) {
      char letterRoman = romanNumber.charAt(i);
      int decimalValue = converter(letterRoman);

      if (decimalValue < preValue) {
        decimalNumber -= decimalValue;
      } else {
        decimalNumber += decimalValue;
      }

      preValue = decimalValue;
    }

    return decimalNumber;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    for(int j = 0; j < n; j +=1) {
      String numberRoman = sc.next();
      System.out.println(numberDecimal(numberRoman));
    }
  }
}
