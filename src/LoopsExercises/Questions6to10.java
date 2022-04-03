package LoopsExercises;

import java.util.Scanner;

public class Questions6to10 {
    public static void main(String[] args) {

        // QUestion 9

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Write second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            if (number1 % number2 != 0) {
                double reminder = number1 % number2;
                if (number1 % reminder == 0) {
                    System.out.println("HCF: " + number1);
                } else {
                    System.out.println("HFC: " + number2);
                }
            } else {
                System.out.println("HFC: " + number2);
            }
        } else {
            if (number2 % number1 != 0) {
                double reminder = number2 % number1;
                if (number2 % reminder == 0) {
                    System.out.println("HCF: " + number2);
                } else {
                    System.out.println("HFC: " + number1);
                }
            } else {
                System.out.println("HFC: " + number1);
            }
        }

    }
}
