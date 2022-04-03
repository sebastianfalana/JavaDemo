package DecisionsExercises;

import java.util.Scanner;

public class Q5678 {
    public static void main(String[] args) {

        //Question5
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj cyfre: ");
//        int variable1 = scanner.nextInt();
//
//        if (variable1 > 0) {
//            System.out.println("Cyfra jest dodatnia");
//        } else if (variable1 == 0) {
//            System.out.println("Cyfra jest równa zero");
//        } else {
//            System.out.println("Cyfra jest ujemna");
//        }

        //Question 6

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj pierwszy kąt:");
//        int variable1 = scanner.nextInt();
//        System.out.println("Podaj drugi kąt:");
//        int variable2 = scanner.nextInt();
//        System.out.println("Podaj trzeci kąt:");
//        int variable3 = scanner.nextInt();
//
//        int sum = variable1 + variable2 + variable3;
//
//        if (sum == 180) {
//            System.out.println("Triangle is valid");
//        } else {
//            System.out.println("Triangle is invalid");
//        }

        //Question 7

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rok:");
//        int year = scanner.nextInt();
//
//        if (((year % 4) == 0) && (((year % 100) == 0) && ((year % 400) == 0))) {
//            System.out.println("Jest to rok przestępny");
//        } else {
//            System.out.println("Jest to rok nie przestępny");
//        }

        //Question 8

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile calls:");
        int calls = scanner.nextInt();
        double bill = 0;

        if (calls <= 100) {
            bill = 200;
            System.out.println("Rachunek za telefon = " + bill);
        } else if (calls > 100 && calls <= 150) {
            bill = 200 + (calls - 100) * 0.6;
            System.out.println("Rachunek za telefon  = " + bill);
        } else if (calls > 150 && calls <= 200) {
            bill = 200 + (50 * 0.6) + (calls - 150) * 0.5;
            System.out.println("Rachunek za telefon  = " + bill);
        } else {
            bill = 200 + (50 * 0.6) + (50 * 0.5) + (calls - 200) * 0.4;
            System.out.println("Rachunek za telefon  = " + bill);
        }
    }
}
