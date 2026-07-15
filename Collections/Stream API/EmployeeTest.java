package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", 22, "Pune"));
        list.add(new Employee(102, "Anjali", 23, "Hyderabad"));
        list.add(new Employee(103, "Kiran", 24, "Pune"));
        list.add(new Employee(104, "Sneha", 21, "Chennai"));
        list.add(new Employee(105, "Ravi", 25, "Pune"));

        List<Employee> result = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}