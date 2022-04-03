package DecisionsExercises;

import java.util.Scanner;

public class Q91011 {
    public static void main(String[] args) {

        // QUestion 9

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wpisz ocene z pierwszego przedmiotu: ");
//        int grade1 = scanner.nextInt();
//        System.out.println("Wpisz ocene z drugiego przedmiotu: ");
//        int grade2 = scanner.nextInt();
//        System.out.println("Wpisz ocene z trzeciego przedmiotu: ");
//        int grade3 = scanner.nextInt();
//
//        double ave = (grade1 + grade2 + grade3) / 3;
//        System.out.println("Srednia ocena: " + ave);
//        char grade = '0';
//
//        if (ave <= 100 && ave >= 90) {
//            grade = 'A';
//        } else if (ave < 90 && ave >= 80) {
//            grade = 'B';
//        } else if (ave < 80 && ave >= 70) {
//            grade = 'C';
//        } else if (ave < 70 && ave >= 60) {
//            grade = 'D';
//        } else if (ave < 60 && ave >= 0) {
//            grade = 'F';
//        }
//
//        System.out.println("Studen otrzymał ocene: " + grade);
//    }

        // Question 10

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wybierz swoja ocene: A, B, C, D, F");
//        char grade = scanner.next().charAt(0);
//
//        switch (grade) {
//            case 'A':
//                System.out.println("Twoja ocena to: A-Ecellent");
//                break;
//
//            case 'B':
//                System.out.println("Twoja ocena to: B-Good");
//                break;
//
//            case 'C':
//                System.out.println("Twoja ocena to: C-Average");
//                break;
//
//            case 'D':
//                System.out.println("Twoja ocena to: D-Deficient");
//                break;
//
//            case 'F':
//                System.out.println("Twoja ocena to: F-Failing");
//                break;
//
//            default:
//                System.out.println("Nie wybrales oceny z podanego zakresu");
//        }

        // Question 11

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwsze imie: ");
        String name1 = scanner.nextLine();
        System.out.println("Wpisz drugie imie: ");
        String name2 = scanner.nextLine();
        System.out.println("Wpisz trzecie imie: ");
        String name3 = scanner.nextLine();
        scanner.nextLine();

        if (name1.compareTo(name2) > 0 && name1.compareTo(name3) > 0) {
            System.out.println(name1);
            if (name2.compareTo(name3) > 0) {
                System.out.println(name2);
                System.out.println(name3);
            } else {
                System.out.println(name3);
                System.out.println(name2);
            }
        } else if (name2.compareTo(name1) > 0 && name2.compareTo(name3) > 0) {
            System.out.println(name2);
            if (name1.compareTo(name3) > 0) {
                System.out.println(name1);
                System.out.println(name3);
            } else {
                System.out.println(name3);
                System.out.println(name1);
            }
        } else {
            System.out.println(name3);
            if (name1.compareTo(name2) > 0) {
                System.out.println(name1);
                System.out.println(name2);
            } else {

                System.out.println(name2);
                System.out.println(name1);
            }

        }
    }
}
