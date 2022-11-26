package ch25_java_again;

public class Ex1_Main {
    public static void main(String[] args) {

        Recipient recipient = new Recipient("Michal", "Kowalski", 34);
        Recipient sender = new Recipient("Wanda", "Kowalski", 44);

        Letter letter = new Letter(recipient, sender, "hgygyjgjhjub");
        letter.send();
    }
}
