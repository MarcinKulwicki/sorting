package sort;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {


        Random random = new Random();
        int[] tab = new int[random.nextInt(100) + 1];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }


        //****Sortowanie babelkowe
//        for(int j= 1; j < tab.length; j++) {
//            for (int i = 0; i < tab.length - j; i++) {
//                if (tab[i] > tab[i + 1]) {
//                    int pom = tab[i];
//                    tab[i] = tab[i + 1];
//                    tab[i + 1] = pom;
//                }
//            }
//        }
        //****Sortowanie przez wybor
        for(int i= 0; i< tab.length; i++){

        }

        System.out.println(tab.length);
        for (Integer counter: tab) {
            System.out.print(counter + " ");
        }
    }
}
