package methods;

public class MethMultiply {

    public static void main(String[] args) {

//        multiply(5, 7);
//        multiply(6, 8, 13);
//        multiply(1, 4, 0, 66);

        System.out.println("podane liczby to: " + multiply(5, 7, 6));
        System.out.println("podane liczby to: " + multiply(5, 7, 9));
        System.out.println("podane liczby to: " + multiply(5, 7, 5, 0));

    }

    public static int multiply(int a, int b) {
        //System.out.println("Podane liczby to: " + a + ", " + b);
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        //System.out.println("Podane liczby to: " + a + ", " + b + ", " + c);
        return a * b * c;
    }

    public static int multiply(int a, int b, int c, int d) {
        //System.out.println("Podane liczby to: " + a + ", " + b + ", " + c + ", " + d);
        return a * b * c * d;
    }

}
