package com.company;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            if (x == 0) {
                System.out.println("Użytkownik podał liczbę 0");
            } else {
                System.out.println("parzysta");
            }
        } else {
            System.out.println("nieparzysta");
        }
    }
}

