// Noa Camino Yenaro Joel
// Programa 5
// ingresa un nombre completo y devuelve un monograma

package tareas;
import javax.swing.*;

public class Programa5 {
  public static void main(String[] args) {
    String name;
    name = JOptionPane.showInputDialog(null, "What is your full name");

    int lrg = name.length();

    String first, second, third;

    first = name.substring(0, 1);
    name = name.substring(name.indexOf(" ") +1, lrg);
    second = name.substring(0, 1);
    third = name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2);

    JOptionPane.showMessageDialog(null, first + second + third);
  }
}


