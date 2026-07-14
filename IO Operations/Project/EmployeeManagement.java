package Demo;

import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeOperation operation = new EmployeeOperation();

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee1");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee1 ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee1 Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee1 Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee1 Salary: ");
                    double salary = sc.nextDouble();

                    Employee1 emp = new Employee1(id, name, age, salary);

                    operation.addEmployee1(emp);

                    System.out.println("Employee added successfully.");

                    break;

                case 2:

                    operation.displayEmployees();

                    break;

                case 3:

                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}