package JavaFundamentals;

import java.util.Arrays;
public class Sorting {
	public static void main(String[] args) {

        int[] arr = {45, 12, 89, 2, 56};

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
