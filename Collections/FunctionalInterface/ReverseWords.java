package functionalinterface;

import java.util.*;
import java.util.function.Consumer;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Java","Python","Wipro","Talent",
                "Next","Apple","Orange","Code",
                "Laptop","Mobile"));

        Consumer<ArrayList<String>> c = l -> {

            for(int i=0;i<l.size();i++){

                String rev =
                        new StringBuilder(l.get(i)).reverse().toString();

                l.set(i, rev);
            }

            System.out.println(l);
        };

        c.accept(list);
    }
}