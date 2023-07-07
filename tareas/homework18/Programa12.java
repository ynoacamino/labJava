package tareas.homework18;
import java.util.Scanner;
public class Programa12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la dificultad y el numero de turnos");
    int dificulty = sc.nextInt();
    int turnos = sc.nextInt();

    int scorePlayer = 0, scoreBot = 0;
    
    for(int i = 1; i <= turnos; i += 1) {
      System.out.println("Adivine el numero");
      int play = sc.nextInt();
      int number = random(dificulty);
      if(play == number) {
        System.out.println("Adivinaste: +1 punto para ti");
        scorePlayer += 1;
      } else {
        System.out.println("El numero era: " + number);
        System.out.println("NO adivinaste: +1 punto para BOT");
        scoreBot += 1;
      }
      mostrarScore(scorePlayer, scoreBot);
    }

    mostrarScore(scorePlayer, scoreBot);
    System.out.println("Gano:" + (scorePlayer > scoreBot ? "Jugador" : "BOT"));
    System.out.println("Dificult level: " + dificulty);
    System.out.println("Turnos: " + turnos);
    
  }
  public static int random(int df) {
    return (int) (Math.random() * df + 1);
  }
  public static void mostrarScore(int sP, int sB) {
    System.out.println("Score player: " + sP);
    System.out.println("Score BOT: " + sB);
  }
}
