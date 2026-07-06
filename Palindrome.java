package JavaFundamentals;

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (original == rev)
            System.out.println(original + " is a palindrome");
        else
            System.out.println(original + " is not a palindrome");
    }

}
