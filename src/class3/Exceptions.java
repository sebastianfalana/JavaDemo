package class3;

import java.util.Arrays;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj index z tablicy: ");
//        int n = scanner.nextInt();
//
//        int[] tab = {3, 4, 5};
//
//        try {
//            //          for (int i = 0; i < 10; i++) {
//            System.out.println(tab[n]);
//            //           }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Spróbowałeś wypisać wartość z poza tablicy");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość indexów w tablicy: ");
        int n = scanner.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj " + i + " index ktory chcesz wpisac do tablicy");
            tab[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(tab));
    }
}
