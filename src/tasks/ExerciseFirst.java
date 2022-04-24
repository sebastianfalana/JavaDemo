package tasks;

import java.util.Random;
import java.util.Scanner;

public class ExerciseFirst {

    public static void main(String[] args) {

        int numberToGuess = getRandomNumber(100);
        System.out.println("Proszę zgadnij liczbę z zakresu 0-99");

        int maxNumberOfTrials = 5;

        for (int i = 1; i <= maxNumberOfTrials; i++) {
            int number = getNumberFromUser();
            if (number == numberToGuess) {
                System.out.println("Zgadłeś!!!");
                break;
            } else if (number < numberToGuess) {
                System.out.println("Podałeś za małą liczbę");
            } else {
                System.out.println("Podałeś za dużą liczbę");
            }


            if (i != maxNumberOfTrials) {
                System.out.println("Masz jeszcze " + (maxNumberOfTrials - i) + " próby");
            } else {
                System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to: " + numberToGuess);
            }
        }
    }

    public static int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        return scanner.nextInt();
    }

}
