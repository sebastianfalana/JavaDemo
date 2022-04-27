package Ch21_Movie;

import java.util.ArrayList;
import java.util.List;

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

        library.addMovie(new Movie("comedy", "Pierwszy film", 1955, wandaRusik, pierwszyFilmActors));
        library.addMovie(drugiFilm);
        library.addMovie(trzeciFilm);

        library.printMovieYear(2000, 2020);

        // library.printMoviesWithActors("Anna", "Kulow");


    }
}
