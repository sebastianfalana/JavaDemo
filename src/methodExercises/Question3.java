package methodExercises;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ciag znaków: ");
        String n = scanner.nextLine();

        for (int i = 0; i < n.length(); i++) {
            char cha = n.charAt(i);
            if (isVowel(cha)) {
                counter++;
            }

        }

        System.out.println("Wpisany ciag znakow posiada : " + counter + " liczbe samogłosek");
    }

    public static boolean isVowel(char ch) {

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
