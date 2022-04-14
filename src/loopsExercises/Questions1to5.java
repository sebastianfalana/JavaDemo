package loopsExercises;

import java.util.Scanner;

public class Questions1to5 {
    public static void main(String[] args) {
        // Question 1
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        // Question 2

//        int i = 0;
//        int sum = 0;
//        for (i = 0; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // Question 3

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write positive int: ");
//        int positive = scanner.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            int sum = positive * i;
//            System.out.println("Tabliczka mnozenia dla: " + positive + " * " + i + ": " + sum);
//        }

        // Question 4

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write positive int: ");
//        int variable = scanner.nextInt();
//        int silnia = 1;
//
//        for (int i = 1; i <= variable; i++) {
//            silnia = silnia * i;
//
//        }
//        System.out.println(silnia);

        // Question 5

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first viable: ");
        int variable1 = scanner.nextInt();
        System.out.println("Write second viable: ");
        int variable2 = scanner.nextInt();
        int power = 1;

        for (int i = 1; i <= variable2; i++) {
            power *= variable1;
        }
        System.out.println(power);
    }
}
