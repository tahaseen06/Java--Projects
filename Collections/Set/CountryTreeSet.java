package Demo;

import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> t = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        t.add(countryName);
        return t;
    }

    public String getCountry(String countryName) {
        for (String s : t) {
            if (s.equalsIgnoreCase(countryName))
                return s;
        }
        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet c = new CountryTreeSet();

        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Japan");
        c.saveCountryNames("Australia");

        System.out.println(c.getCountry("Japan"));
        System.out.println(c.getCountry("China"));
    }
}