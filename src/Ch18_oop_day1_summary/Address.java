package Ch18_oop_day1_summary;

public class Address {
    String street;
    int houseNumber;
    City city;
    int streetNumber;


    public Address(String street, int houseNumber, City city, int streetNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.streetNumber = streetNumber;
    }

    public String getData() {
        return "City: " + city.getData() + " " + street + " " + streetNumber + "/" + houseNumber;
    }
}
