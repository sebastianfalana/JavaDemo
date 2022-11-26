package ch26_hash_amps;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Polska", "Warszawa");
        map.put("Francja", "Paryz");
        map.put("Anglia", "Londyn");
        map.put("Niemcy", "Berlin");

        System.out.println(map.get("Polska"));

        System.out.println(map);

        map.put("Polska", "Krakow");
        System.out.println(map);
        System.out.println(map.get("Chorwacja"));

    }
}
