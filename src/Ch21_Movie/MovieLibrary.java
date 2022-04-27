package Ch21_Movie;

import java.util.List;

public class MovieLibrary {

    List<Movie> movies;

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void printMovieYear(int yearStart, int yearEnd) {
        for (Movie movie : movies) {
            if (movie.getYear() > yearStart && movie.getYear() < yearEnd) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public void printMoviesWithActors(String firstName, String lastName) {
        for (Movie movie : movies) {
            for (Actor actor : movie.getActors()) {
                if (actor.getFirstName().equals(firstName) && actor.getLastName().equals(lastName)) {
                    System.out.println(movie.getTitle());
                }
            }
        }

    }
}
