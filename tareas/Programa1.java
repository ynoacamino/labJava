// Noa Camino Yenaro Joel
// Programa 1 | modo grafico
// Pide un numero y devuelve un codigo con la primera y ultima letra

package tareas;
import javax.swing.*;

public class Programa1 {
  public static void main(String[] args) {
    
    String name, codigo;

    name = JOptionPane.showInputDialog(null, "What is your name");

    int lrg = name.length();

    codigo = name.substring(0, 1) + name.substring(lrg-1, lrg) + name.indexOf("a");

    JOptionPane.showMessageDialog(null, codigo);
  }
}



