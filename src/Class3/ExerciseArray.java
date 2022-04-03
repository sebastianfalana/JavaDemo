package Class3;

import java.util.Scanner;

public class ExerciseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wielkość tablicy: ");
        int n = scanner.nextInt();

        // int n = 10;
        int[] tab = new int[n];

        for (int i = 0; i <= tab.length; i++) {
            tab[i] = i * i;
            System.out.println("Element o indeksie " + i + " ma wartość " + tab[i]);
        }
    }
}
