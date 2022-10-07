package TP3;
import java.util.*;;

public class EX6 {
    public static void main(String[] args) {

        Scanner ch= new Scanner(System.in);

        System.out.println("Quel est votre prenom ?"); 
        String prenom= ch.nextLine();

        System.out.println("Quel est votre nom ?"); 
        String nom= ch.nextLine();

        System.out.println("Quel age avez vous ?"); 
        String age= ch.nextLine();

        System.out.println("Quel est votre taille (en metres) ?"); 
        String taille = ch.nextLine();

        System.out.println("Quel est votre poids (en kg) ?"); 
        String poid = ch.nextLine();

        System.out.println("Bonjour, vous vous appelez "+ prenom + " " + nom + " et vous avez " + age + " ans."); 
        System.out.println("Votre taille est " + taille + "m " + " et votre poids est " + poid + "kg"); 

        ch.close();

    }
}
