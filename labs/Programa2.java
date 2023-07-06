import graphics.*;

public class Programa2 {
    public static void main(String[] args) {
        Picture cellWhite = Picture.casilleroBlanco();
        Picture cellBlack = Picture.casilleroBlanco().invertir();
        Picture rowTable = cellWhite.alLado(cellBlack)
            .alLado(cellWhite).alLado(cellBlack)
            .alLado(cellWhite).alLado(cellBlack)
            .alLado(cellWhite).alLado(cellBlack)
            .invertir(); // Linea agregada para inveritir los colores y no tener que crear desde cero

        Graphics display = new Graphics(rowTable);
        display.print();
    }
}
