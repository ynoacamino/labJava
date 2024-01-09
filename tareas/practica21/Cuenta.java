package tareas.practica21;

public class Cuenta {
  private int balance;
  private String name;

  public Cuenta (String nombre, int saldo) {
    this.name = nombre;
    this.balance = saldo;
  }

  public void retirar(double money) {
    if(this.balance - money < 0) System.out.println("El saldo no es suficiente");
    this.balance -= money;
  }
  public void depositar(double money){
    this.balance += money;
  }

  public boolean isPremium() {
    return this.balance>50000;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String nombre) {
    this.name = nombre;
  }
  public double getBalance() {
    return this.balance;
  }
  public void setBalance(int saldo) {
    this.balance = saldo;
  }
}
