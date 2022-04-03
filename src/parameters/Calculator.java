package parameters;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        calculatorMenu();

        int selectedOption = getNumbersFromUser();

        switch (selectedOption) {
            case 1:
                System.out.println("Wynik dodawania: " + add(getNumbersFromUser(), getNumbersFromUser()));
                break;
            case 2:
                System.out.println("Wynik dodawania: " + subctract(getNumbersFromUser(), getNumbersFromUser()));
                break;
            case 3:
                System.out.println("Wynik dodawania: " + multiply(getNumbersFromUser(), getNumbersFromUser()));
                break;
            case 4:
                System.out.println("Wynik dodawania: " + divide(getNumbersFromUser(), getNumbersFromUser()));
                break;
        }

//        System.out.println(add(getNumbersFromUser(), getNumbersFromUser()));
//        System.out.println(subctract(getNumbersFromUser(), getNumbersFromUser()));
//        System.out.println(multiply(getNumbersFromUser(), getNumbersFromUser()));
//        System.out.println(divide(getNumbersFromUser(), getNumbersFromUser()));
    }

    public static void calculatorMenu() {
        System.out.println("Menu programu:");
        System.out.println("1 - Dodawanie");
        System.out.println("2 - Odejmowanie");
        System.out.println("3 - Mnożenie");
        System.out.println("4 - Dzielenie");

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subctract(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int multiply(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static int divide(int a, int b) {
        int divi = a / b;
        return divi;
    }

    public static int getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwsza cyfre: ");
        int a = scanner.nextInt();
        return a;

    }
}
