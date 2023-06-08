package Problemas;
import java.util.*;

public class Problema1fake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = s1;

        int como = 0;
        while(s1.indexOf("como") != -1){
            int position = s1.indexOf("como");
            s1 = s1.substring(position + 4, s1.length());
            como += 1;
            System.out.println(s1);
        }

        int cual = 0;
        while(s2.indexOf("cual") != -1){
            int position = s2.indexOf("cual");
            s2 = s2.substring(position + 4, s2.length());
            cual += 1;
            System.out.println(s2);
        }

        if(cual == como) {
            System.out.println("Igual cantidad");
        }else{
            System.out.println("Distinta cantidad");
        }
    }
}
