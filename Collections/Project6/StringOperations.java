package StringOperations;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // 1. Replace alternate characters of S1 with S2
        StringBuilder result1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                result1.append(s2);
            else
                result1.append(s1.charAt(i));
        }
        list.add(result1.toString());

        // 2. Replace last occurrence of S2 with reverse(S2)
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last && first != -1) {
            String rev = new StringBuilder(s2).reverse().toString();
            String result2 = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(result2);
        } else {
            list.add(s1 + s2);
        }

        // 3. Delete first occurrence of S2
        if (first != last && first != -1) {
            String result3 = s1.substring(0, first) + s1.substring(first + s2.length());
            list.add(result3);
        } else {
            list.add(s1);
        }

        // 4. Divide S2 into two halves
        int mid = (s2.length() + 1) / 2;
        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);
        list.add(firstHalf + s1 + secondHalf);

        // 5. Replace characters in S1 that are present in S2 with *
        StringBuilder result5 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) != -1)
                result5.append("*");
            else
                result5.append(s1.charAt(i));
        }

        list.add(result5.toString());

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();

        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();

        ArrayList<String> result = performOperations(s1, s2);

        System.out.println(result);

        sc.close();
    }
}