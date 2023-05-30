// NOA CAMINO, Yenaro Joel
import java.util.*;

class Ejercicio08_02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int score_1 = sc.nextInt();
    int score_2 = sc.nextInt();
    sc.close();
    String msg;

    if(score_1 >= 17 || score_2 >= 17) {
      msg = "Avanza a la siguiente etapa";
    } else if(score_1 <= 2 || score_2 <=2) {
      msg = "No avanza y se despide";
    } else {
      msg = "Se queda en reserva";
    }

    System.out.println(msg);
  }
}