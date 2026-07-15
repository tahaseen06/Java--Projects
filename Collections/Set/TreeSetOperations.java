package Demo;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {
	public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Mango");
        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nContains Mango? " + ts.contains("Mango"));
    }
}

