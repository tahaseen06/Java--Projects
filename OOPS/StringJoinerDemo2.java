package OOPS;

import java.util.StringJoiner;
public class StringJoinerDemo2 {

    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");

        s1.add("Hyderabad");
        s1.add("Chennai");
        s1.add("Bangalore");

        StringJoiner s2 = new StringJoiner("-");

        s2.add("Delhi");
        s2.add("Mumbai");
        s2.add("Pune");

        // Case 1: s1 merged to s2
        StringJoiner temp1 = new StringJoiner("-");
        temp1.merge(s2);
        temp1.merge(s1);
        System.out.println("s1 merged to s2 : " + temp1);

        // Case 2: s2 merged to s1
        StringJoiner temp2 = new StringJoiner("-");
        temp2.merge(s1);
        temp2.merge(s2);
        System.out.println("s2 merged to s1 : " + temp2);
    }
}