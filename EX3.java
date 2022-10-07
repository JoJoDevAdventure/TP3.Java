package TP3;

public class EX3 {

        public static void main(String[] args) {
            int [] tab = new int [] {1, 1, 7, 3, 2, 2, 2, 4, 1};
            int [] count = new int[100];
            int i,tmp = 0;

            for(i = 0; i < tab.length; i++){
                    tmp = tab[i];
                    count[tmp]++;
            }
            for(i=1; i < count.length; i++){
                if(count[i] > 0 && count[i] == 1){
                 System.out.printf("%d se produit %d fois\n",i, count[i]);
                 }
                else if(count[i] >= 2){
                    System.out.printf("%d se produit %d fois\n",i, count[i]);
                }
             }
        }
}
