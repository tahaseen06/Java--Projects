package Demo;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student " + i + " Name:");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0)
                        throw new InvalidMarkException("Marks cannot be negative");

                    if (mark > 100)
                        throw new InvalidMarkException("Marks should be between 0 and 100");

                    total += mark;
                }

                double avg = total / 3.0;

                System.out.println("Student Name : " + name);
                System.out.println("Average Marks : " + avg);
                System.out.println();
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}