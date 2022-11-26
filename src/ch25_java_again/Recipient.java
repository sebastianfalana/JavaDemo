package ch25_java_again;

public class Recipient {

    String firstName;
    String lastName;
    int age;

    public Recipient(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Imię: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
    }
}
