package TP3;

public class EX8 {
    public static void main(String[] args) {
        int reste;
        boolean flag = true;
        int nbr = 17;
              
        for(int i=2; i <= nbr/2; i++)
        {
           //nombre est divisible par lui-meme
           reste = nbr%i;
                  
           //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
           if(reste == 0)
           {
              flag = false;
              break;
           }
        }
        
        //si flag est true, alors nombre est premier, sinon non premier
        if(flag)
           System.out.println(nbr + " est un nombre premier");
        else
           System.out.println(nbr + " n'est pas un nombre premier");
        }
}
