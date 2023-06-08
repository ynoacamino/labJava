package Problemas;
import java.util.*;

public class Programa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adn = sc.nextLine();
        int num = sc.nextInt();
        String cadena = adn.substring(0, num);

        int repet = -1;
        int i = 0;
        while( i < adn.length() - num ){
            if( cadena.equals(adn.substring(i, i + num)) ) {
                repet += 1;
            }

            i += 1;
        }

        System.out.println(repet);
    }
}
