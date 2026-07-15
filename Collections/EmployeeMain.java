package Demo;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Rahul",
                "rahul@gmail.com", "Male", 35000);

        Employee e2 = new Employee(102, "Anjali",
                "anjali@gmail.com", "Female", 42000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        System.out.println("Employee Details");
        db.showAllEmployees();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deleting Employee 102");

        db.showAllEmployees();
    }
}