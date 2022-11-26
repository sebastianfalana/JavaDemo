package ch25_java_again;

public class Letter {

    Recipient recipient;
    Recipient sender;
    String content;

    public Letter(Recipient recipient, Recipient sender, String content) {
        this.recipient = recipient;
        this.sender = sender;
        this.content = content;
    }

    public void send() {
        recipient.printInfo();
        System.out.println("Treść listu: " + content);
        sender.printInfo();
    }


}
