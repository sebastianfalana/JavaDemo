package Ch20_Exercise_Animal;

public class Eagle extends Bird {
    int clawsLenght;

    public Eagle(String name, int wingspan, int clawsLenght) {
        super(name, wingspan, true);
        this.clawsLenght = clawsLenght;
    }
}
