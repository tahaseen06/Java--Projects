package JavaFundamentals;

import java.util.Scanner;
public class Digits {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(; n > 0; n = n / 10) {
            sum = sum + (n % 10);
        }

        System.out.println(sum);
    }
}
