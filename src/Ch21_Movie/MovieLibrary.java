package Ch21_Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {

    List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public MovieLibrary() {
        movies = new ArrayList<>();
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

    public void printMovie(String movieName) {
        for (Movie movie :
                movies) {
            if (movie.getTitle().contains(movieName)) {
                System.out.println("Movie name: " + movie.getName() + " \nMovie title: " + movie.getTitle() + " \nMovie year: " + movie.getYear() + "\nDirector: " +
                        movie.getDirector().getFirstName() + " " + movie.getDirector().getLastName() + "\nActors:");
                for (Actor actor :
                        movie.getActors()) {
                    System.out.println(actor.getFirstName() + " " + actor.getLastName());
                }
            }
        }
    }

    public void printRandomMovie(int randomNumber) {
        for (Movie movie :
                movies) {
            if (movie.equals(movies.get(randomNumber))) {
                System.out.println("Movie name: " + movie.getName() + " \nMovie title: " + movie.getTitle() + " \nMovie year: " + movie.getYear() + "\nDirector: " +
                        movie.getDirector().getFirstName() + " " + movie.getDirector().getLastName() + "\nActors:");
                for (Actor actor :
                        movie.getActors()) {
                    System.out.println(actor.getFirstName() + " " + actor.getLastName());
                }
            }
        }
    }
}
