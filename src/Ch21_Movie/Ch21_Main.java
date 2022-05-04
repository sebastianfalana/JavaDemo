package Ch21_Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ch21_Main {

    public static void main(String[] args) {

        Actor januszKowal = new Actor("Janusz", "Kowal");
        Actor tadeuszWajcha = new Actor("Tadeusz", "Wajcha");
        Actor joannaWierzbicka = new Actor("Joanna", "Wierzbicka");
        Actor trevorSzaszy = new Actor("Trewor", "Szaszy");
        Actor annaKulow = new Actor("Anna", "Kulow");


        List<Actor> pierwszyFilmActors = new ArrayList<>();
        pierwszyFilmActors.add(januszKowal);
        pierwszyFilmActors.add(tadeuszWajcha);
        pierwszyFilmActors.add(joannaWierzbicka);

        List<Actor> drugiFilmActors = new ArrayList<>();
        drugiFilmActors.add(trevorSzaszy);
        drugiFilmActors.add(annaKulow);
        drugiFilmActors.add(januszKowal);

        List<Actor> trzeciFilmActors = new ArrayList<>();
        trzeciFilmActors.add(annaKulow);
        trzeciFilmActors.add(joannaWierzbicka);
        trzeciFilmActors.add(trevorSzaszy);
        trzeciFilmActors.add(new Actor("Jaromir", "Jaki"));

        Director wandaRusik = new Director("Wanda", "Rusik");
        Director joakimNawrot = new Director("Joakim", "Nawrot");

        Movie pierwszyFilm = new Movie("comedy", "Pierwszy film", 1955, wandaRusik, pierwszyFilmActors);
        Movie drugiFilm = new Movie("triller", "Drugi film", 2001, joakimNawrot, drugiFilmActors);
        Movie trzeciFilm = new Movie("action", "Trzeci film", 2020, joakimNawrot, trzeciFilmActors);


        MovieLibrary library = new MovieLibrary();
        // tutaj po prostu ćwiczyłem i od razu dodałem objekt Movie do listy library
        library.addMovie(new Movie("comedy", "Pierwszy film", 1955, wandaRusik, pierwszyFilmActors));
        library.addMovie(drugiFilm);
        library.addMovie(trzeciFilm);


        //library.printMovieYear(2000, 2020);
        // library.printMoviesWithActors("Anna", "Kulow");

        Ch21_Menu menu = new Ch21_Menu();
        int option = menu.printMenu();

        switch (option) {
            case 1:
                System.out.println("Podaj dwie daty");
                System.out.println("Pierwsza data");
                int startDay = new Scanner(System.in).nextInt();
                System.out.println("Druga data");
                int endDay = new Scanner(System.in).nextInt();
                library.printMovieYear(startDay, endDay);
                break;
            case 2:
                //tutaj nie wiem czy dobrze zrozumialem ze system ma losowac dowolny film i wyswietlic wszytskie jego dane
                //czy tez losowy film ma podac uzytkownik i system ma wyswietlic wszytskie jego dane, daltego tez zrobiłem
                //dwa sposoby. Pierwszy to losowany film przez system a drugi (który jest zakomentowany) podawany przez uzytkownika
                //Jak checmy druga opcje to po prostu odkomentowujemy jedna a zdruga zakomentowujemy.

                Random r = new Random();
                int randomitem = r.nextInt(library.getMovies().size());
                library.printRandomMovie(randomitem);

//                System.out.println("Podaj nazwe filmu, o którym informacji potrzebujesz:");
//                String titleFromUser = new Scanner(System.in).next();
//                library.printMovieDetails(titleFromUser);

                break;
            case 3:
                System.out.println("Podaj imię aktora: ");
                String firstName = new Scanner(System.in).next();
                System.out.println("Podaj nazwisko aktora: ");
                String lastName = new Scanner(System.in).next();
                library.printMoviesWithActors(firstName, lastName);
                break;
            case 4:
                System.out.println("Podaj nazwe:");
                String name = new Scanner(System.in).next();
                System.out.println("Podaj tytuł:");
                String title = new Scanner(System.in).next();
                System.out.println("Podaj rok produkcji:");
                int productionYear = new Scanner(System.in).nextInt();
                System.out.println("Podaj imie rezysera:");
                String firstNameDirectorFromUser = new Scanner(System.in).next();
                System.out.println("Podaj nazwisko rezysera:");
                String laseNameDirectorFromUser = new Scanner(System.in).next();
                System.out.println("Ilu aktorów chcesz dodać:");
                int howManyActorsFromUSer = new Scanner(System.in).nextInt();

                //dodałem tez metodę do MovieLibrary, takze jak odkumentujemy linijke 144 a zakomentujemy całego for-a
                //u dołu razem z linijka 103, wtedy odpali sie metoda actorsFromUser() z MovieLibrary
                List<Actor> actorsFromUser = new ArrayList<>();
                for (int i = 0; i < howManyActorsFromUSer; i++) {
                    System.out.println("Podaj imie " + (i + 1) + " aktora:");
                    String firstNameActorFromUser = new Scanner(System.in).next();
                    System.out.println("Podaj nazwisko " + (i + 1) + " aktora:");
                    String lastNameActorFromUser = new Scanner(System.in).next();
                    actorsFromUser.add(new Actor(firstNameActorFromUser, lastNameActorFromUser));
                }

                Director director = new Director(firstNameDirectorFromUser, laseNameDirectorFromUser);

                library.addMovie(new Movie(name, title, productionYear, director, actorsFromUser));
//                library.addMovie(new Movie(name, title, productionYear, director, library.actorsFromUser(howManyActorsFromUSer)));
                library.printMovieDetails(title);

                break;

            default:
                System.out.println("Podałeś liczbe z poza zakresu");
        }

    }
}
