package tareas.practica21;

public class Reactangulo {
  private double width;
  private double height;
  private double area;
  private double perimetro;


  public Reactangulo() {
    this.width = 1;
    this.height = 1;
    this.area = 1;
  }

  public Reactangulo(double w, double h) {
    this.width = w;
    this.height = h;
    this.area = w * h;

  }

  public Reactangulo(double w) {
    this.width = w;
    this.height = 1;
    this.area = w;
  }

  public boolean isSquare () {
    return this.width == this.height;
  }
  public double getWidth() {
    return this.width;
  }
  public double getHeight() {
    return this.height;
  }


}
