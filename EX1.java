package TP3;
import java.util.*;

public class EX1 {
    public static void main(String[] args) {

        Scanner ch= new Scanner(System.in);

        System.out.print("Enter a number : ");  
        String str= ch.nextLine();
        double num = Integer.parseInt(str); 

        ch.close();

        double racine = 0;

        if (num < 0) {
            System.out.println("NaN");
        } else if ( num == 0) {
            racine = 0;
        } else {
            racine = Math.sqrt(num);
        }

        System.out.println("Racine carrée de " + num + " = " + racine);
    }

}