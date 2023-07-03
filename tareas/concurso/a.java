package tareas.concurso;
import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      String version = sc.nextLine();
      int num = conversor(version);
      System.out.println(num);
    }
  }

  public static int conversor(String version) {
    int length = version.length();
    int num = 0;
    for (int pos = 0; pos < version.length(); pos++) {
      switch (version.charAt(pos)) {
         case 'I':
          if (pos + 1 < length && (version.charAt(pos + 1) == 'V' || version.charAt(pos + 1) == 'X')) {
            num--;
          } else num++;
          break;
        case 'V':
          num += 5;
          break;
        case 'X':
          if (pos + 1 < length && (version.charAt(pos + 1) == 'L' || version.charAt(pos + 1) == 'C')) {
            num -= 10;
          } else num += 10;
          break;
        case 'L':
          num += 50;
          break;
        case 'C':
          if (pos + 1 < length && (version.charAt(pos + 1) == 'D' || version.charAt(pos + 1) == 'M')) {
            num -= 100;
          } else num += 100;
          break;
        case 'D':
          num += 500;
          break;
        case 'M':
          num += 1000;
          break;
      }
    }
    return num;
  }
}