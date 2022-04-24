package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8_Array {

    public static void main(String[] args) {

        int arraySize = getArraySize();
        //int[] arrayA = getArrayNumbers(arraySize);
        int[] arrayB = getArrayNumbers(arraySize);


//        for (int i = 0; i < arraySize; i++) {
//            for (int j = i + 1; j < arraySize; j++) {
//                int tmp = 0;
//                if (arrayA[i] > arrayA[j]) {
//                    arrayA[i] = arrayA[i];
//                } else {
//                    tmp = arrayA[i];
//                    arrayA[i] = arrayA[j];
//                    arrayA[j] = tmp;
//                }
//            }
//        }

        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                int tmp = 0;
                if (arrayB[i] < arrayB[j]) {
                    arrayB[i] = arrayB[i];
                } else {
                    tmp = arrayB[i];
                    arrayB[i] = arrayB[j];
                    arrayB[j] = tmp;
                }
            }
        }
        System.out.println("Array A asc: " + Arrays.toString(sortArrayAsc(arraySize)));
        //System.out.println("Array B asc: " + Arrays.toString(arrayB));
    }

    public static int getArraySize() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wielkość tablicy: ");
        return scanner.nextInt();
    }

    public static int[] getArrayNumbers(int arraySize) {

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pass " + i + " numbers:  ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArrayAsc(int arraySize) {
        int[] array = getArrayNumbers(arraySize);
        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                int tmp = 0;
                if (array[i] > array[j]) {
                    array[i] = array[i];
                } else {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
