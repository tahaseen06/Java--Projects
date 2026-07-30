package Demo;

import java.sql.*;

public class ExecuteQuery {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
            	    "jdbc:oracle:thin:@localhost:1521:XE",
            	    "system",
            	    "system");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM EMP");

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + "  " +
                        rs.getString("ENAME"));
            }

            rs.close();
            stmt.close();
            con.close();

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

}