package tareas.practica21;

public class Reactangulo {
  private double width;
  private double height;


  public Reactangulo() {
    this.width = 1;
    this.height = 1;
  }

  public Reactangulo(double w, double h) {
    this.width = w;
    this.height = h;

  }

  public Reactangulo(double w) {
    this.width = w;
    this.height = 1;
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

  public void setWidth(double ancho) {
    this.width = ancho;
  }
  public void setHeight(double alto) {
    this.height = alto;
  }
}
