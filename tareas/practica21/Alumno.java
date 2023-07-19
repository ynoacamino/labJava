package tareas.practica21;

public class Alumno {
  private int age;
  private String name;
  private double average;

  public Alumno(int edad, String nombre, double promedio) {
    this.age = edad;
    this.name = nombre;
    this.average = promedio;
  }

  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }
  public double getAverage() {
    return this.average;
  }

  public void setAge(int edad) {
    this.age = edad;
  }
  public void setName(String nombre) {
    this.name = nombre;
  }
  public void setAverage(double promedio) {
    this.average = promedio;
  }

  public String toString(){
    return "Nombre: " + this.name + ", Edad: " + this.age + ", Promedio: " + this.average;
  }

}
