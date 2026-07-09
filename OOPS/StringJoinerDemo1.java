package OOPS;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerDemo1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Anil");
        names.add("Kiran");
        names.add("Ravi");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String s : names) {
            sj.add(s);
        }

        System.out.println(sj);
    }
}