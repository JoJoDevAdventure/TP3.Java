package TP3;
import java.util.*;

public class EX7 {
    public static void main(String[] args) {

        Scanner ch= new Scanner(System.in);

        System.out.print("Entrer le rayon : ");  
        String str= ch.nextLine();
        double num = Integer.parseInt(str); 

        ch.close();

        double surface = Math.PI * num * num;

        System.out.println("la surface du cercle de rayon " + num + " = " + surface);
    }
}
