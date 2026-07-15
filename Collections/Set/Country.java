package Demo;

import java.util.HashSet;

public class Country {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        for (String s : H1) {
            if (s.equalsIgnoreCase(countryName))
                return s;
        }
        return null;
    }

    public static void main(String[] args) {

        Country c = new Country();

        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Japan");
        c.saveCountryNames("Australia");

        System.out.println(c.getCountry("India"));
        System.out.println(c.getCountry("Canada"));
    }
}