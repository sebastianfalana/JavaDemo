import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe pierwsza");
        int cyfra1 = scanner.nextInt();
        System.out.println("Podaj liczbe druga");
        int cyfra2 = scanner.nextInt();
        System.out.println("Wybierz dzialanie: 1-dodawanie, 2-odejmowanie, 3-mnozenie, 4-dzielenie");
        int dzialanie = scanner.nextInt();

        switch (dzialanie) {
            case 1:
                int dodawanie = cyfra1 + cyfra2;
                System.out.println("Wynik działania " + cyfra1 + "+" + cyfra2 + " = " + dodawanie);
                break;
            case 2:
                int odejmowanie = cyfra1 - cyfra2;
                System.out.println("Wynik działania " + cyfra1 + "-" + cyfra2 + " = " + odejmowanie);
                break;
            case 3:
                double mnozenie = cyfra1 * cyfra2;
                System.out.println("Wynik działania " + cyfra1 + "*" + cyfra2 + " = " + mnozenie);
                break;
            case 4:
                double dzielenie = cyfra1 / cyfra2;
                System.out.println("Wynik działania " + cyfra1 + "/" + cyfra2 + " = " + dzielenie);
                break;
            default:
                System.out.println("Nie wybrałeś działania z podanej listy");

        }
    }
}
