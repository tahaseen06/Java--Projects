package Demo;

import java.util.ArrayList;
import java.util.Random;

public class PrimeLambda {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 25; i++)
            a1.add(r.nextInt(100) + 1);

        System.out.println("Numbers : " + a1);

        System.out.println("Prime Numbers :");

        a1.forEach(n -> {
            boolean prime = true;

            if (n < 2)
                prime = false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(n + " ");
        });
    }
}