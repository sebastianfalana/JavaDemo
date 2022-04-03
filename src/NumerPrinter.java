package com.company;

public class NumerPrinter {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
            counter++;
        }
        System.out.println("Suma liczb " + sum);
        System.out.println("Suma pętli " + counter);
    }
}
