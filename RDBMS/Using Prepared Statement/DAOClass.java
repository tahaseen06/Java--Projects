package student;

import java.sql.*;

public class DAOClass {

    Connection con;

    // Constructor
    public DAOClass() {

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                    "system",
                    "system");

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Insert Record
    public void insert(int rollNo, String studentName,
                       String standard, String dob, double fees) {

        try {

            String sql = "INSERT INTO Student VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollNo);
            ps.setString(2, studentName);
            ps.setString(3, standard);

            java.sql.Date date =
                    java.sql.Date.valueOf(dob);

            ps.setDate(4, date);

            ps.setDouble(5, fees);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete Record
    public void delete(int rollNo) {

        try {

            // Copy into StudentLog

            String logQuery =
                    "INSERT INTO StudentLog " +
                    "SELECT RollNo,StudentName,Standard,SYSDATE " +
                    "FROM Student WHERE RollNo=?";

            PreparedStatement ps1 =
                    con.prepareStatement(logQuery);

            ps1.setInt(1, rollNo);

            ps1.executeUpdate();

            // Delete from Student

            String deleteQuery =
                    "DELETE FROM Student WHERE RollNo=?";

            PreparedStatement ps2 =
                    con.prepareStatement(deleteQuery);

            ps2.setInt(1, rollNo);

            int rows = ps2.executeUpdate();

            if (rows > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Modify Fees
    public void modify(int rollNo, double fees) {

        try {

            String sql =
                    "UPDATE Student SET Fees=? WHERE RollNo=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setDouble(1, fees);
            ps.setInt(2, rollNo);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Record Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Display All Records
    public void display() {

        try {

            String sql =
                    "SELECT * FROM Student";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("RollNo") + "  "
                        + rs.getString("StudentName") + "  "
                        + rs.getString("Standard") + "  "
                        + rs.getDate("Date_Of_Birth") + "  "
                        + rs.getDouble("Fees"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Display Single Record
   
        
        public void display(int rollNo) {

            try {

                String sql = "SELECT * FROM Student WHERE RollNo=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, rollNo);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    System.out.println(
                            rs.getInt("RollNo") + "  "
                            + rs.getString("StudentName") + "  "
                            + rs.getString("Standard") + "  "
                            + rs.getDate("Date_Of_Birth") + "  "
                            + rs.getDouble("Fees"));

                } else {

                    System.out.println("Record Not Found");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

    }

    }