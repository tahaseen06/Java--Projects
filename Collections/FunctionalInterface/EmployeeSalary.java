package functionalinterface;

import java.util.*;
import java.util.function.Predicate;

public class EmployeeSalary {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Rahul","Hyderabad",9000));
        list.add(new Employee(2,"Ravi","Pune",12000));
        list.add(new Employee(3,"Anu","Delhi",8500));
        list.add(new Employee(4,"Kiran","Chennai",18000));
        list.add(new Employee(5,"Sneha","Bangalore",7000));

        Predicate<Employee> p = e -> e.getSalary() < 10000;

        list.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}