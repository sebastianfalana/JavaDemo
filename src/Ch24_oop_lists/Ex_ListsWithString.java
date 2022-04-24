package Ch24_oop_lists;

import java.util.ArrayList;
import java.util.List;

public class Ex_ListsWithString {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        printNumbersOfElement(names);

        names.add("Seba");
        names.add("KArol");
        names.add("Marian");

        printNumbersOfElement(names);

        System.out.println("Element na indexie 3 to: " + names.get(2));

        printList(names);

    }

    public static void printNumbersOfElement(List<String> list) {
        System.out.println("Ilość elementów w liście to: " + list.size());
    }

    public static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + " listy to: " + list.get(i));
        }
    }
}
