package functionalinterface;

import java.util.*;
import java.util.function.Consumer;

public class EvenOddConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(2, 5, 10, 17, 20, 25, 30, 33, 40, 45));

        Consumer<Integer> consumer = n -> {
            if (n % 2 == 0)
                System.out.println(n + " Even");
            else
                System.out.println(n + " Odd");
        };

        list.forEach(consumer);
    }
}
