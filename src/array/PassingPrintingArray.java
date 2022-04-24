package array;

import java.util.Scanner;

public class PassingPrintingArray {
    public static void main(String[] args) {

        int n = sizeOfArray();
        int[] array = new int[n];

        passNumbers(array);
        printArray(array);
        System.out.println("");
        System.out.println("Sum of array = " + sumArray(array));
    }

    public static int sizeOfArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wielkość tablicy: ");
        int n = scanner.nextInt();
        return n;
    }

    public static void passNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pass " + i + " numbers:  ");
            array[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
