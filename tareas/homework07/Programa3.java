package tareas.homework07;

//Simulacion de un juego de dados, cada jugador tira dos dados y se muestra la
//suma de los dados
public class Programa3 {
  public static void main(String[] args) {
    int py1Dd1 = (int) (Math.random()*6 +1);
    int py1Dd2 = (int) (Math.random()*6 +1);
    int py1Sum = py1Dd1 + py1Dd2;

    int py2Dd1 = (int) (Math.random()*6 +1);
    int py2Dd2 = (int) (Math.random()*6 +1);
    int py2Sum = py2Dd1 + py2Dd2;

    System.out.println("Jugador 1: " + py1Dd1 + " " + py1Dd2 + " = " + py1Sum);
    System.out.println("Jugador 2: " + py2Dd1 + " " + py2Dd2 + " = " + py2Sum);
  }
}


