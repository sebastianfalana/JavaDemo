package Ch21_Movie;

import java.util.List;

public class Movie {
    private String name;
    private String title;
    private int year;
    private Director director;
    private List<Actor> actors;

    public Movie(String name, String title, int year, Director director, List<Actor> actors) {
        this.name = name;
        this.title = title;
        this.year = year;
        this.director = director;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }


}
