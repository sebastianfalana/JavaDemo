package ch25_java_again;

public class Cat extends Animal {

    int jumpHeight;

    public Cat(String name, int jumphigh) {
        super(name);
        this.jumpHeight = jumphigh;
    }

    public void meaow() {
        System.out.println("meaow " + "Name: " + name + " , " + "Jump Height: " + jumpHeight);
    }
}
