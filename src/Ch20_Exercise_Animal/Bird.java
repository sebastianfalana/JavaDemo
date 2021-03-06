package Ch20_Exercise_Animal;

public class Bird extends Animal {
    int wingspan;
    boolean canFly;

    public Bird(String name, int wingspan, boolean canFly) {
        super(name);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    public void introduce() {
        System.out.println("I'm bird, my name is " + name + " and I have " + wingspan + " wingspan.");
    }

    public void fly() {

        if (canFly) {
            System.out.println("I can fly");
        } else {
            System.out.println("I can't fly");
        }
    }
}
