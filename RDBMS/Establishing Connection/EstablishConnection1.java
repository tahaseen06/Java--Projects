package Demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection1 {

    public static void main(String[] args) {

        Connection con = null;

        try {

            // Driver registration is commented
            // Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "system",
                    "system");

            System.out.println("Connection Established successfully");

            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            System.out.println(e);

        }
    }
}