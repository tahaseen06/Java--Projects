package Demo;

import java.util.Scanner;

public class IsOdd {

    public static int isOdd(int num) {
        if (num % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(isOdd(n));

        sc.close();
    }
}