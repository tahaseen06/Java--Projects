package Demo;

import java.io.*;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String input = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String output = sc.nextLine();

        try {

            FileReader fr = new FileReader(input);
            FileWriter fw = new FileWriter(output);

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File is copied.");

        } catch (IOException e) {
            System.out.println("Error while copying file.");
        }

        sc.close();
    }
}