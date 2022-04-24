package Ch20_Exercise_Animal;

public class Ch20_Main_Animal {

    public static void main(String[] args) {
//        Dog dog = new Dog("Basko", 200);
//
//        dog.bark();
//        dog.introduce();
//        dog.eat();

//        Bird bird = new Bird("Sikor", 200, true);
//
//        bird.eat();
//        bird.introduce();
//        bird.fly();

        Eagle eagle = new Eagle("Orli", 200, 150);
        Pinquin pinquin = new Pinquin("Stas", 230, 34);

        eagle.introduce();
        eagle.eat();
        eagle.fly();
        System.out.println("Claws leght: " + eagle.clawsLenght + "\n");

        eagle.introduce();
        pinquin.eat();
        pinquin.fly();
        System.out.println("Swimming Spead: " + pinquin.swimmingSpeed);


        // Animal.eat(); //jeżeii metoda eat() byłaby static wtecy mozna dostac sie do tej metody poprzez klasę
    }
}
