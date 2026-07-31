package student;

import java.sql.*;

public class DAOClass {

    Connection con;

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

    public void getNetSalary(int empno) {

        try {

            CallableStatement cs =
                    con.prepareCall("{call CAL_NETSAL(?,?)}");

            cs.setInt(1, empno);
            cs.registerOutParameter(2, Types.NUMERIC);

            cs.execute();

            double netSalary = cs.getDouble(2);

            PreparedStatement ps =
                    con.prepareStatement(
                            "SELECT ENAME FROM EMP WHERE EMPNO=?");

            ps.setInt(1, empno);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Employee Number : " + empno);
                System.out.println("Employee Name   : " + rs.getString("ENAME"));
                System.out.println("Net Salary      : " + netSalary);

            } else {

                System.out.println("Employee Not Found");

            }

            rs.close();
            ps.close();
            cs.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}