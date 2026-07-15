package functionalinterface;

import java.util.*;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "madam","java","level","wipro",
                "radar","apple","noon","car","refer","book"));

        Predicate<String> p =
                s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        words.stream()
             .filter(p)
             .forEach(System.out::println);
    }
}