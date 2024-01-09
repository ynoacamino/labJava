package tareas.practica21;

public class Programa3 {
  public static void main(String[] args) {
    Cuenta miCuenta = new Cuenta("Yenaro", 1000);

    System.out.println(miCuenta.getBalance());
    miCuenta.depositar(100);;
    System.out.println(miCuenta.getBalance());

    System.out.println("es primium?  " + miCuenta.isPremium());
  }
}
