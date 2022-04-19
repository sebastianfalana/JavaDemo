package tasks;

import java.util.Random;
import java.util.Scanner;

public class ExerciseFirst {

    public static void main(String[] args) {

        int numberToGuess = getRandomNumber();
        System.out.println("Proszę zgadnij liczbę z zakresu 0-99");

        // get numbers from user
        for (int i = 1; i <= 5; i++) {
            int number = getNumberFromUser();
            if (number == numberToGuess) {
                System.out.println("Zgadłeś!!!");
                break;
            } else if (number < numberToGuess) {
                System.out.println("Podałeś za małą liczbę");
            } else {
                System.out.println("Podałeś za dużą liczbę");
            }

            // how many trials left
            if (i != 5) {
                System.out.println("Masz jeszcze " + (5 - i) + " próby");
            } else {
                System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to: " + numberToGuess);
            }
        }
    }

    public static int getRandomNumber() {
        return new Random().nextInt(100);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        return scanner.nextInt();
    }

}
