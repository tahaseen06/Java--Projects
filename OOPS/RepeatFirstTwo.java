package OOPS;

public class RepeatFirstTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String first = str.substring(0,2);

        for(int i=0;i<str.length();i++)
            System.out.print(first);

        sc.close();
    }
}
