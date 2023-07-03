package tareas.homework17;
import java.util.Scanner;

public class Programa1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    int num5 = sc.nextInt();
    int num6 = sc.nextInt();
    int num7 = sc.nextInt();
    int num8 = sc.nextInt();

    System.out.println(mayor8(num1, num2, num3, num4, num5, num6, num7, num8));
  }

  public static int mayor2(int num1, int num2) {
    return Math.max(num1, num2);
  }

  public static int mayor8(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8) {
    return mayor2(mayor2(mayor2(num1, num2), mayor2(num3, num4)), mayor2(mayor2(num5, num6), mayor2(num7, num8)));
  }
}
