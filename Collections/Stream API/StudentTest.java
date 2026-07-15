package streamapi;
import java.util.*;
import java.util.stream.Collectors;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Rahul", 65));
        list.add(new Student(2, "Anjali", 40));
        list.add(new Student(3, "Kiran", 80));
        list.add(new Student(4, "Sneha", 55));
        list.add(new Student(5, "Ravi", 35));

        List<Student> passed = list.stream()
                .filter(s -> s.mark >= 50)
                .collect(Collectors.toList());

        passed.forEach(System.out::println);

        System.out.println("Students Passed = " + passed.size());
    }
}