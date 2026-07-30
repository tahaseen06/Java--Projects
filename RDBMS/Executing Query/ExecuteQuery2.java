package Demo;

import java.sql.*;

public class ExecuteQuery2 {

	public static void main(String[] args) {

        try {

            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Connect to Oracle Database
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "system",
                    "system");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery(
                    "SELECT ENAME, JOB, SAL, COMM FROM EMP WHERE SAL > 1000 AND SAL < 2000");

            // Display Heading
            System.out.println("ENAME\tJOB\t\tSAL\tCOMM");
            System.out.println("-------------------------------------------");

            // Display Records
            while (rs.next()) {

                String ename = rs.getString("ENAME");
                String job = rs.getString("JOB");
                int sal = rs.getInt("SAL");
                String comm = rs.getString("COMM");

                System.out.println(ename + "\t" + job + "\t\t" + sal + "\t" + comm);
            }

            // Close Resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}