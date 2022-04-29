package Ch21_Movie;

import java.util.Scanner;

public class Ch21_Menu {

    public int printMenu() {

        System.out.println("1. Podaj dwie daty aby wyświetlić nazwy filmów nagranych pomiędzy tymi datami");
        System.out.println("2. Wyświetl wszystkie informacje o losowym filmie");
        System.out.println("3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich grał");
        System.out.println("4. Dodaj nowy film do listy");

        return new Scanner(System.in).nextInt();
    }

}

