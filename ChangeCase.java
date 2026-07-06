package JavaFundamentals;

import java.util.Scanner;
public class ChangeCase {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " -> " + Character.toUpperCase(ch));
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " -> " + Character.toLowerCase(ch));

        sc.close();
    }
}
