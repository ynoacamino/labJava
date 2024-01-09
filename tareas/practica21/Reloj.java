package tareas.practica21;

public class Reloj {
  private int segundo;
  private int minuto;
  private int hora;

  public Reloj(int seg, int min, int hour) {
    if(seg >= 0 && seg < 60 && min >= 0 && min <60 && hour >= 0 && hour < 60)  {
      this.segundo = seg;
      this.minuto = min;
      this.hora = hour;
    } else System.out.println("Ingresa valores correctos");
  }

  public void setSegundo(int seg) {
    if(seg < 0 || seg >= 60) System.out.println("Ingresa valores correctos");
    this.segundo = seg;
  }
  public void setMinuto(int min) {
    if(min < 0 || min >= 60) System.out.println("Ingresa valores correctos");
    this.minuto = min;
  }
  public void setHora(int hour) {
    if(hour < 0 || hour >= 24) System.out.println("Ingresa valores correctos");
    this.hora = hour;
  }
  public int getSegundo() {
    return this.segundo;
  }
  public int getMinuto() {
    return this.minuto;
  }
  public int getHora() {
    return this.hora;
  }

  public void aumentarSegundo(int seg) {
    this.segundo += seg;
    if(this.segundo >= 60) {
      this.minuto += this.segundo /60;
      this.segundo %= 60;
    }
  }
  public void aumentarMinuto(int min) {
    this.minuto += min;
    if(this.minuto >= 60) {
      this.hora += this.hora /60;
      this.minuto %= 60;
    }
  }
  public void aumentarHora(int hour) {
    this.hora += hour;
  }

  public void mostrarHora() {
    System.out.println(hora + ":" + minuto + ":" + segundo);
  }
}
