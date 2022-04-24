package array;

import java.util.Scanner;

public class Ex6_Array {
    public static void main(String[] args) {

        int[] array = new int[sizeArray()];
        setArrayNumbers(array);
        System.out.println("MAX of array: " + maxArrayValue(array));
        System.out.println("MIN of array: " + minArrayValue(array));
    }


    public static int sizeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pass array size:  ");
        return scanner.nextInt();
    }

    public static void setArrayNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pass " + i + " number:");
            array[i] = scanner.nextInt();
        }
    }

    public static int maxArrayValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minArrayValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
