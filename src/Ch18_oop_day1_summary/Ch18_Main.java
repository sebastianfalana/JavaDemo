package Ch18_oop_day1_summary;

public class Ch18_Main {

    public static void main(String[] args) {


        City london = new City("London", 2221);
        Address downingStreet = new Address("Downing Street", 32, london, 4);
        Person sender = new Person("Jan", "Kowal", downingStreet);

        City warsaw = new City("Warsaw", 444221);
        Address krucza = new Address("Krucza", 3, warsaw, 6);
        Person recipient = new Person("Wojtek", "Marski", krucza);

        Letter letter = new Letter(sender, recipient, "Bla bla");

        System.out.println(letter.getData());
    }
}
