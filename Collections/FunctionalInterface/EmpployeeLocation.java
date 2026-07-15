package functionalinterface;

import java.util.*;
import java.util.function.Function;

public class EmpployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Rahul","Hyderabad",35000));
        list.add(new Employee(102,"Ravi","Chennai",30000));
        list.add(new Employee(103,"Anu","Pune",28000));
        list.add(new Employee(104,"Kiran","Bangalore",45000));
        list.add(new Employee(105,"Sneha","Delhi",40000));

        Function<Employee,String> f = Employee::getLocation;

        ArrayList<String> locations = new ArrayList<>();

        for(Employee e:list)
            locations.add(f.apply(e));

        System.out.println(locations);
    }
}