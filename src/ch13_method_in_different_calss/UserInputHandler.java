package ch13_method_in_different_calss;

import java.util.Scanner;

public class UserInputHandler {

    public static int getNumberFromUser() {
        return new Scanner(System.in).nextInt();
    }
}
