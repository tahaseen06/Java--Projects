package Demo;


import java.util.*;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> e : M1.entrySet()) {
            if (e.getValue().equalsIgnoreCase(capital))
                return e.getKey();
        }
        return null;
    }

    public HashMap<String, String> swapKeyValue() {
        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> e : M1.entrySet()) {
            M2.put(e.getValue(), e.getKey());
        }
        return M2;
    }

    public ArrayList<String> toArrayList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India : " + obj.getCapital("India"));
        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));
        System.out.println("Swapped Map : " + obj.swapKeyValue());
        System.out.println("Countries : " + obj.toArrayList());
    }
}