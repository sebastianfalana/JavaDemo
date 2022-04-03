package parameters;

import java.util.Scanner;

public class ParametersDemo {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wpisz number: ");
//        int n = scanner.nextInt();
//        System.out.println("Wpisz divider: ");
//        int d = scanner.nextInt();

        int[] dividers = {3, 4, 7, 8};

        printIfNumberCanBeDividedBy2(getNumberFromUser(), dividers);
        printIfNumberCanBeDividedBy2(getNumberFromUser(), dividers);
        printIfNumberCanBeDividedBy2(getNumberFromUser(), dividers);
        printIfNumberCanBeDividedBy2(getNumberFromUser(), dividers);
        printIfNumberCanBeDividedBy2(getNumberFromUser(), dividers);
    }

    public static void printIfNumberIsEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is event");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void printIfNumberIsDivisibleByThree(int number) {
        if (number % 3 == 0) {
            System.out.println("Number is divisible by three");
        } else {
            System.out.println("Number isn't divisible by three");

        }
    }

    public static void printIfNumberCanBeDividedBy(int number, int divider) {
        if (number % divider == 0) {
            System.out.println("Number " + number + " is divisible by " + divider);
        } else {
            System.out.println("Number " + number + " isn't divisible by " + divider);

        }
    }

    public static void printIfNumberCanBeDividedBy2(int number, int[] dividers) {

        for (int i = 0; i < dividers.length; i++) {


            if (number % dividers[i] == 0) {
                System.out.println("Number " + number + " is divisible by " + dividers[i]);
            } else {
                System.out.println("Number " + number + " isn't divisible by " + dividers[i]);
            }
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz number: ");
        int n = scanner.nextInt();
        return n;
    }

}
