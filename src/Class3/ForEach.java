package Class3;

public class ForEach {
    public static void main(String[] args) {
        String[] cars = {"bmw", "audi", "ford"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        ;

        for (String ca : cars) {
            System.out.println(ca);
        }
    }
}
