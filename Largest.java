package JavaFundamentals;

import java.util.Arrays;
public class Largest {
	public static void main(String[] args) {

        int[] arr = {45, 12, 89, 2, 56, 9};

        Arrays.sort(arr);

        System.out.println("Smallest two numbers:");
        System.out.println(arr[0] + " " + arr[1]);

        System.out.println("Largest two numbers:");
        System.out.println(arr[arr.length-2] + " " + arr[arr.length-1]);
    }
}
