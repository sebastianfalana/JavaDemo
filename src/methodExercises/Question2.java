package methodExercises;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz number: ");
        int n = scanner.nextInt();

        System.out.println("Czy wpisany numer jest parzysty: " + isEven(n));

    }

    public static boolean isEven(int arg) {
        if (arg % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
