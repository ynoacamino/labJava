package tareas.homework18;
import java.util.Scanner;
public class Programa10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int playPlayer1 = rollDice();
      int playPlayer2 = rollDice();
      int playBot1 = rollDice();
      int playBot2 = rollDice();

      System.out.println("JUGADOR: Dado1: " + playPlayer1 + ", Dado2: " + playPlayer2);
      System.out.println("BOT: Dado1: " + playBot1 + ", Dado2: " + playBot2);
      if(playPlayer1 + playPlayer2 > playBot1 + playBot2) {
        System.out.println("Gana el jugador");
      } else if( playPlayer1 + playPlayer2 < playBot1 + playBot2) {
        System.out.println("Gana la computadora");
      } else {
        System.out.println("Empate");
      }
      
      System.out.println("continuar? (s)");
      String next = sc.nextLine();
      if(!next.equals("s")) break;
    }
  }

  public static int rollDice() {
    return (int) (Math.random()*6 + 1);
  }
}
