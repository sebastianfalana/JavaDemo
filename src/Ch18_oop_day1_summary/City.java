package Ch18_oop_day1_summary;

public class City {

    String name;
    int zipcode;

    public City(String name, int zipcode) {
        this.name = name;
        this.zipcode = zipcode;
    }

    public String getData() {
        return name + " zipCode: " + zipcode;
    }
}
