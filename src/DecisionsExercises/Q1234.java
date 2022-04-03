package DecisionsExercises;

import java.util.Scanner;

public class Q1234 {
    public static void main(String[] args) {

        //Question 1

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj cyfre");
//        int cyfra = scanner.nextInt();
//        if (cyfra % 2 == 0) {
//            System.out.println("Podałeś liczbę parzystą");
//        } else {
//            System.out.println("Podałeś liczbę nieparzystą");
//        }

        //Question 3

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj cene produktu:");
//        int price = scanner.nextInt();
//        System.out.println("Podaj ilość:");
//        int quant = scanner.nextInt();
//        int reveniu = price * quant;
//
//        if (reveniu > 5000) {
//            double discount = reveniu * 0.1;
//            double value = reveniu - discount;
//            System.out.println("Discount value = " + discount);
//            System.out.println("Value = " + value);
//        } else {
//            System.out.println(reveniu);
//        }

        //Question 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza cyfre:");
        int variable1 = scanner.nextInt();
        System.out.println("Podaj druga cyfre:");
        int variable2 = scanner.nextInt();
        System.out.println("Podaj trzecia cyfre:");
        int variable3 = scanner.nextInt();

        if (variable1 > variable2) {
            if (variable1 > variable3) {
                System.out.println(variable1);
            } else {
                System.out.println(variable3);
            }
        } else if (variable2 > variable3) {
            System.out.println(variable2);
        } else {
            System.out.println(variable3);
        }


    }
}
