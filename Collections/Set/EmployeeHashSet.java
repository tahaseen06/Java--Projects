package Demo;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> emp = new HashSet<>();

        emp.add("Rahul");
        emp.add("Anjali");
        emp.add("Kiran");
        emp.add("Sneha");

        Iterator<String> it = emp.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}