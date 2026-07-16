package Demo;

import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int num) {
        return Math.abs(num % 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Last Digit = " + getLastDigit(n));

        sc.close();
    }
}