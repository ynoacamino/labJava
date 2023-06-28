package tareas.homework16;
import java.util.*;

public class Programa15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int winPlayer= 0, winPc =0, playerD1, playerD2, pcD1, pcD2;;
    
    while( true ) {
      playerD1 = (int) (Math.random()*6 +1);
      playerD2 = (int) (Math.random()*6 +1);
      pcD1 = (int) (Math.random()*6) +1;
      pcD2 = (int) (Math.random()*6) +1;
      
      System.out.println("Jugador: dado 1 = " + playerD1 +
        " dado 2 = " + playerD2 + ", sumatoria = " + (playerD1 +playerD2)
      );

      System.out.println("Pc: dado 1 = " + pcD1 +
        " dado 2 = " + pcD2 + ", sumatoria = " + (pcD1 +pcD2)
      );

      if(playerD1 + playerD2 > pcD1 + pcD2) {
        winPlayer += 1;
        System.err.println("Gano el jugador");
      }
      else {
        winPc += 1;
        System.out.println("Gano la pc");
      }

      System.out.println("Quieres salir? Ingresa: 0");
      int salir = sc.nextInt();
      if(salir == 0) break;
    }

    if(winPc > winPlayer) {
      System.out.println("Gano la pc");
    } else if (winPc < winPlayer) {
      System.out.println("Gano el jugador");
    } else {
      System.out.println("Empate");
    }

    System.out.println("Puntos:");
    System.out.println("Pc: " + winPc + " Jugador: " + winPlayer);
  }
}
