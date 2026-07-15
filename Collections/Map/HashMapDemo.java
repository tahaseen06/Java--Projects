package Demo;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Rahul");
        map.put("102", "Anjali");
        map.put("103", "Kiran");

        System.out.println("Key Exists : " + map.containsKey("101"));

        System.out.println("Value Exists : " + map.containsValue("Rahul"));

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> e = it.next();
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}