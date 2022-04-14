package methodExercises;

public class Question4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.println("This value is prime: " + i);
            }
        }

    }

    public static boolean isPrime(int value) {

        for (int i = 2; i < value; i++) {

            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}