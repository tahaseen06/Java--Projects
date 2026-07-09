package OOPS;

import java.util.Scanner;
public class RepeatLast {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String last = str.substring(str.length() - 3);

        for (int i = 0; i < 3; i++)
            System.out.print(last);

        sc.close();
    }
}
