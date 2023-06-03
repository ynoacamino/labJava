// Noa Camino Yenaro Joel
// Programa 3
// ingresa un nombre completo y devuelve un monograma

package tareas.homework06;
import javax.swing.*;

public class Programa3 {
  public static void main(String[] args) {
    String name,ap1, ap2;

    name = JOptionPane.showInputDialog(null, "What is your name");
    ap1 = JOptionPane.showInputDialog(null, "What is your first lastname");
    ap2 = JOptionPane.showInputDialog(null, "What is your second lastname");

    String first, second, third;

    first = name.substring(0, 1);
    second = ap1.substring(0, 1);
    third = ap2.substring(0, 1);

    JOptionPane.showMessageDialog(null, first + second + third);
  }
}


