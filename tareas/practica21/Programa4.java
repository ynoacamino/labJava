package tareas.practica21;

public class Programa4 {
  public static void main(String[] args) {
    Reloj clock = new Reloj(32, 23, 4);

    System.out.println(clock.getSegundo());
    System.out.println(clock.getMinuto());
    System.out.println(clock.getHora());

    clock.mostrarHora();
  }
}
