
//programa que imprime el tipo de juvilacion a la que pertenece
import java.util.*;

public class hw09_Programa06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();
    int timeWork = sc.nextInt();

    if(age < 60 && timeWork >= 25) {
      System.out.println("Pertenece a la jubilacion por antiguedad joven");
    } else if(age >= 60 && timeWork < 25) {
      System.out.println("Pertenece a la jubilacion por edad");
    } else if(age >= 60 && timeWork >= 25){
      System.out.println("Pertenece a la jubilacion por antiguedad adulta");
    } else {
      System.out.println("No accede a la jubilacion");
    }
  }
}
