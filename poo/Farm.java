package poo;

public class Farm {
  public static void main(String[] args) {
    Pato donald = new Pato("cuack", false, "black", 300, 0.5);

    System.out.println(donald.getAge());
    donald.setColor("white");
    System.out.println(donald.getColor());
  }
}
