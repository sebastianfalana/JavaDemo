package ch13_method_in_different_calss;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj dwie cyfry");
        System.out.println("Podaj pierwsza cyfrę: ");
        int a = UserInputHandler.getNumberFromUser();
        System.out.println("Podaj drugą cyfrę: ");
        int b = UserInputHandler.getNumberFromUser();

        System.out.println("Wybierz z menu opcje:");
        Menu.printOption();
        int number = UserInputHandler.getNumberFromUser();

        switch (number) {
            case 1:
                System.out.println("Wynik dodawania to: " + Calculator.add(a, b));
                Calculator.add(UserInputHandler.getNumberFromUser(), UserInputHandler.getNumberFromUser());
                break;
            case 2:
                System.out.println("Wynik odejmowania to: " + Calculator.substract(a, b));
                break;
            default:
                System.out.println("Podana cyfra nie jest z zakresu");
        }
    }
}
