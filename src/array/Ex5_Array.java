package array;

import java.util.Scanner;

public class Ex5_Array {

    public static void main(String[] args) {
        int[] list1 = new int[5];
        int[] list2 = new int[5];

        setArrayNumbers(list1);
        passArrayNumbers(list2, list1);

        System.out.println("List1 numbers: ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i]);
        }
        System.out.println("");

        System.out.println("List2 numbers: ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i]);
        }
    }


    public static void setArrayNumbers(int[] list1) {
        for (int i = 0; i < list1.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pass " + i + " numbers:  ");
            list1[i] = scanner.nextInt();
        }
    }

    public static void passArrayNumbers(int[] list2, int[] list1) {
        for (int i = 0; i < 5; i++) {
            list2[i] = list1[4 - i];
        }
    }

}

