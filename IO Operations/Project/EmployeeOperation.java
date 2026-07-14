package Demo;

import java.io.*;
import java.util.ArrayList;

public class EmployeeOperation {

    private final String FILE_NAME = "employee.dat";

    // Add Employee
    public void addEmployee1(Employee1 emp) {

        ArrayList<Employee1> list = readEmployees();

        list.add(emp);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(list);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Display All Employees
    public void displayEmployees() {

        ArrayList<Employee1> list = readEmployees();

        if (list.isEmpty()) {
            System.out.println("No Employees Found.");
            return;
        }

        System.out.println("\n------ Report ------");

        for (Employee1 emp : list) {
            System.out.println(emp.getEmpId() + " "
                    + emp.getEmpName() + " "
                    + emp.getAge() + " "
                    + emp.getSalary());
        }

        System.out.println("------ End of Report ------");
    }

    // Read Employees from file
    @SuppressWarnings("unchecked")
    private ArrayList<Employee1> readEmployees() {

        ArrayList<Employee1> list = new ArrayList<>();

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return list;
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            list = (ArrayList<Employee1>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}