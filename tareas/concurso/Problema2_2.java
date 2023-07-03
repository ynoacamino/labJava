package tareas.concurso;

import java.util.Scanner;
import java.util.ArrayList;

public class Problema2_2 {

  public static int converter(String str) {
    for(int i = 0; i < str.length(); i += 1) {
      if (str.charAt(i) == '1') return 1;
      if (str.charAt(i) == '2') return 2;
      if (str.charAt(i) == '3') return 3;
      if (str.charAt(i) == '4') return 4;
      if (str.charAt(i) == '5') return 5;
      if (str.charAt(i) == '6') return 6;
      if (str.charAt(i) == '7') return 7;
      if (str.charAt(i) == '8') return 8;
      if (str.charAt(i) == '9') return 9;
      if (str.charAt(i) == '0') return 0;
    }
    return -1;
  }
  public static int saveMemory(int num, String str){
    ArrayList<String> cadenas = new ArrayList<String>();

    int preventI = 0;

    for(int i = 1; i <= str.length(); i += 1) {
      if(i % num == 0 ) {
        cadenas.add(str.substring(preventI, i));
        preventI = i ;
      }
    }

    int[] sumLetters = new int[num];

    for(int i = 0; i < num; i += 1) {
      int sumNumbers = 0;
      for(int j = 0; j < cadenas.size(); j += 1) {
        int letterToNumber = cadenas.get(j).charAt(i) - 'a' + 1;
        sumNumbers += letterToNumber;
      }
      sumNumbers %= 10;
      sumLetters[i] = sumNumbers;
    }

    System.out.println(sumLetters[0]);
    System.out.println(sumLetters[1]);
    System.out.println(sumLetters[2]);
    System.out.println(sumLetters[3]);

    int multiplyLetters = 1;

    for(int i = 0; i < sumLetters.length; i += 1) {
      multiplyLetters *= (sumLetters[i] + 1);
    }

    return (multiplyLetters % 10) + 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1 = converter(sc.nextLine());
    String str1 = sc.nextLine().toLowerCase();

    int num2 = converter(sc.nextLine());
    String str2 = sc.nextLine().toLowerCase();

    char letterFinal = (char) ('a' + saveMemory(num2, str2) - 1);

    String respuesta = saveMemory(num1, str1) + "-" + letterFinal;
    

    System.out.println(respuesta.toUpperCase());
  }
}
