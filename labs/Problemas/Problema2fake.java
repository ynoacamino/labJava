package Problemas;

import java.util.*;

public class Problema2fake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String adn = sc.nextLine();
        int num = sc.nextInt();
        String cadena = adn.substring(0, num);

        int repet = -1;
        while(adn.indexOf(cadena) != -1){
            int position = adn.indexOf(cadena);
            adn = adn.substring(position + 1, adn.length());
            repet += 1;
        }

        System.out.println(repet);
    }
}
