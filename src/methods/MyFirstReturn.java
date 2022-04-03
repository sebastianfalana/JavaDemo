package methods;

public class MyFirstReturn {
//    public static void main(String[] args) {
//        int x = getNumber();
//        System.out.println("zwócę wartość: "+x);
//        System.out.println("zwócę wartość: "+getNumber());
//    }
//
//    public static int getNumber() {
//        System.out.println("bede zwracal wartość 5");
//        return 5;
//    }

    public static void main(String[] args) {

        System.out.println(getNumber());
        System.out.println(getValue());
        System.out.println(getBoolean());

    }

    public static int getNumber() {
        System.out.println("bede zwracal wartość int: 5");
        return 5;
    }

    public static String getValue() {
        System.out.println("bede zwracal wartość String: Bla bla bla");
        return "Bla bla bla";
    }

    public static boolean getBoolean() {
        System.out.println("bede zwracal wartość boolean: true");
        return true;
    }


}
