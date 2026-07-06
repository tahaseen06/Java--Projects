package JavaFundamentals;

public class Maximum {
	public static void main(String[] args) {

        int[] arr = {10, 45, 3, 78, 25};

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

}
