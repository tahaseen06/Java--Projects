package Demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Rahul",
                LocalDate.of(2002, 5, 15),
                "IT",
                "Developer",
                50000);

        try {

            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}