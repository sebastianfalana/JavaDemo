package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayHigh = getArrayHigh();
        int[] numbers = getArrayValues(arrayHigh);
        int[] reversed = new int[arrayHigh];

//        for (int i = 0; i < arrayHigh; i++) {
//            System.out.println("Podaj " + i + " cyfrę");
//            numbers[i] = scanner.nextInt();
//        }

        for (int i = 0; i < arrayHigh; i++) {
            reversed[arrayHigh - i - 1] = numbers[i];
        }
        System.out.println("Tablica reversed posiada wartości: " + Arrays.toString(reversed));
        System.out.println("Dla porównania tablica numbers: " + Arrays.toString(numbers));
        System.out.println("Prosze zobacz czy tablica reveresed jest odwrotnościa tablicy numbers: ");
        System.out.println("Tablica reveresd: " + Arrays.toString(reversed));
        System.out.println("Tablica numbers:  " + Arrays.toString(numbers));

    }

    public static int[] getArrayValues(int arrayHigh) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[arrayHigh];
        for (int i = 0; i < arrayHigh; i++) {
            System.out.println("Podaj " + (i + 1) + " cyfrę");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static int getArrayHigh() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy:");
        return scanner.nextInt();
    }

}
