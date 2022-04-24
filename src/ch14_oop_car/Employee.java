package ch14_oop_car;

public class Employee {

    String imię;
    String nazwisko;
    int wiek;

    public Employee(String imię, String nazwisko, int wiek) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }


    public void printInfo() {
        System.out.println("Imię: " + imię);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
    }

}
