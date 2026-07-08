package OOPS;

public class TestEmployee {
	public static void main(String[] args) {

        Employee emp = new Employee(
                "Shaik Tahaseen",
                600000,
                2026,
                "NI12345");

        System.out.println("Name : " + emp.getName());
        System.out.println("Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("Insurance No : " + emp.getNationalInsuranceNumber());
    }
}
