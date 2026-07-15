package Demo;

import java.util.*;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");
        p.put("Tamil Nadu", "Chennai");

        Iterator<Object> it = p.keySet().iterator();

        while (it.hasNext()) {

            Object state = it.next();

            System.out.println(state + " -> " + p.get(state));
        }
    }
}