package OOPS;

import java.util.Scanner;
public class ConcatenateString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.charAt(s1.length()-1) == s2.charAt(0))
            System.out.println((s1 + s2.substring(1)).toLowerCase());
        else
            System.out.println((s1 + s2).toLowerCase());

        sc.close();
    }
}
