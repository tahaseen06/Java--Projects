package Demo;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class CountryHashTable {

    Hashtable<String, String> M1 = new Hashtable<>();

    public void saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> e : M1.entrySet()) {

            if (e.getValue().equals(capital))
                return e.getKey();
        }

        return null;
    }

    public Hashtable<String, String> swapKeyValue() {

        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> e : M1.entrySet())
            M2.put(e.getValue(), e.getKey());

        return M2;
    }

    public ArrayList<String> toArrayList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        CountryHashTable obj = new CountryHashTable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.swapKeyValue());
        System.out.println(obj.toArrayList());
    }
}