package com.company;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę dochodu:");
        int dochod = scanner.nextInt();
        double tax = 0;
        double prog1 = 120000 * 0.17;
        double prog2 = 880000 * 0.32;


        if (dochod <= 120000) {
            tax += dochod * 0.17;
        } else if (dochod <= 1000000) {
            tax += prog1 + (dochod - 120000) * 0.32;
        } else if (dochod < 1000000) {
            tax += prog1 + prog2 + (dochod - 1000000) * 0.36;
        }
        System.out.println("Podatek do zapłacenia " + tax);
    }
}
