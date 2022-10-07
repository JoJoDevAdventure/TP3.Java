package TP3;
import java.util.*;

public class EX2 {
    public static void main(String[] args) {

        Scanner ch= new Scanner(System.in);

        System.out.print("Enter a number : ");  
        String str= ch.nextLine();
        double num = Integer.parseInt(str); 

        ch.close();

        if (num > 0) {
            System.out.println("nombre positif");
            if (num % 2 == 0) {
                System.out.println("nombre pair");
            } else {
                System.out.println("nombre impair");
            }
        } else if (num < 0) {
            System.out.println("nombre negatif");
            if (num % 2 == 0) {
                System.out.println("nombre pair");
            } else {
                System.out.println("nombre impair");
            }
        } else {
            System.out.println("nombre = 0");
        }


    }
}
