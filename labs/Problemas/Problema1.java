package Problemas;
import java.util.*;

public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine().toLowerCase();

        int i = 0;
        int cual = 0;
        int como = 0;

        while(i < cadena.length() - 4){
            if( "como".equals(cadena.substring(i, i + 4)) ){
                como += 1;
            }
            if( "cual".equals(cadena.substring(i, i + 4)) ){
                cual += 1;
            }
            i += 1;
        }

        System.out.println(como);
        System.out.println(cual);

        if(cual == como) {
            System.out.println("Igual cantidad");
        }else{
            System.out.println("Distinta cantidad");
        }
    }
}


