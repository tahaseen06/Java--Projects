package Demo;

import java.io.Serializable;

public class Employee1 implements Serializable {

    private int empId;
    private String empName;
    private int age;
    private double salary;

    // Default Constructor
    public Employee1() {
    }

    // Parameterized Constructor
    public Employee1(int empId, String empName, int age, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empId + " " + empName + " " + age + " " + salary;
    }
}