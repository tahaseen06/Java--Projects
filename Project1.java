package project1;

public class Project1 {

    public static void main(String[] args) {

        // Employee data
        int empNo[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007};

        String empName[] = {"Ashish", "Sushma", "Rahul",
                            "Chahat", "Ranjan", "Suman", "Tanmay"};

        String dept[] = {"R&D", "PM", "Acct",
                         "Front Desk", "Engg",
                         "Manufacturing", "PM"};

        char code[] = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};

        int basic[] = {20000, 30000, 10000, 12000, 50000, 23000, 29000};

        int hra[] = {8000, 12000, 8000, 6000, 20000, 9000, 12000};

        int it[] = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        // Get employee id from command line
        int id = Integer.parseInt(args[0]);

        boolean found = false;

        for (int i = 0; i < empNo.length; i++) {

            if (empNo[i] == id) {

                found = true;

                String designation = "";
                int da = 0;

                // Find designation and DA
                switch (code[i]) {

                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;

                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;

                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;

                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;

                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                }

                // Calculate salary
                int salary = basic[i] + hra[i] + da - it[i];

                // Print output
                System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(empNo[i] + "\t" +
                                   empName[i] + "\t\t" +
                                   dept[i] + "\t\t" +
                                   designation + "\t\t" +
                                   salary);
            }
        }

        // If employee not found
        if (!found) {
            System.out.println("There is no employee with empid : " + id);
        }
    }
}