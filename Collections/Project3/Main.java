package cards;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();
        TreeMap<String, Integer> map = new TreeMap<>();

        int count = 0;

        while (set.size() < 4) {

            System.out.println("Enter a card :");
            String symbol = sc.next();

            int number = sc.nextInt();

            count++;

            if (!set.contains(symbol)) {
                set.add(symbol);
                map.put(symbol, number);
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are:");

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        sc.close();
    }
}