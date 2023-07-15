package tareas.homework20;
import java.util.*;

public class Programa6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese numero de jugadores: ");
    int playersNum = sc.nextInt();
    System.out.print("Ingrese numero de dados: ");
    int diceNum = sc.nextInt();

    int[] frecuencias = new int[6];
    int[] playersPoints = new int[playersNum];

    for(int i = 0; i < playersNum; i += 1) {
      int points = 0;
      for(int j = 0; j < diceNum; j += 1) {
        int num = random(6);
        frecuencias[num -1] += 1;
        points += num;
      }
      playersPoints[i] = points;
    }

    System.out.println("El ganador es: JUGADOR " + (maxIndexArray(playersPoints) + 1));
    System.out.println("El numero que mas salio es: " + (maxIndexArray(frecuencias) + 1));
  }

  public static int random(int i) {
    return (int) (Math.random() * i +1);
  }

  public static int maxIndexArray(int[] arr) {
    int max = 0;
    int index = 0;
    for(int i = 0; i < arr.length; i += 1) {
      if(max < arr[i]) {
        max = arr[i];
        index = i;
      }
    }
    return index;
  }
}
