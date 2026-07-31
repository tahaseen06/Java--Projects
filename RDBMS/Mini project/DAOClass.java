package student;

import java.sql.*;
import java.util.ArrayList;

public class DAOClass {

    Connection con;

    public DAOClass() {
        con = DBUtil.getConnection();
    }

    // Scenario 1
    public String getUserType(String userID) {

        String type = null;

        try {

            PreparedStatement ps = con.prepareStatement(
                    "SELECT USERTYPE FROM USERS WHERE USERID=?");

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                type = rs.getString("USERTYPE");
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return type;
    }

    // Scenario 2
    public int getIncorrectAttempts(String userID) {

        int attempts = -1;

        try {

            PreparedStatement ps = con.prepareStatement(
                    "SELECT INCORRECTATTEMPTS FROM USERS WHERE USERID=?");

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                attempts = rs.getInt("INCORRECTATTEMPTS");
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return attempts;
    }

    // Scenario 3
    public int changeUserType(String userID) {

        int rows = 0;

        try {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE USERS SET USERTYPE='Admin' WHERE USERID=?");

            ps.setString(1, userID);

            rows = ps.executeUpdate();

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }

    // Scenario 4
    public ArrayList<String> getLockStatus() {

        ArrayList<String> list = new ArrayList<String>();

        try {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT USERID FROM USERS WHERE LOCKSTATUS=0");

            while (rs.next()) {
                list.add(rs.getString(1));
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Scenario 5
    public int changeName(String userID, String name) {

        int rows = 0;

        try {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE USERS SET NAME=? WHERE USERID=?");

            ps.setString(1, name);
            ps.setString(2, userID);

            rows = ps.executeUpdate();

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }
 // Scenario 6
    public int changePassword(String password) {

        int rows = 0;

        try {

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE USERS SET PASSWORD=? WHERE USERID='AB1001'");

            ps.setString(1, password);

            rows = ps.executeUpdate();

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }
 // Scenario 7
    public int addUser_1(UserBean bean) {

        int rows = 0;

        try {

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO USERS VALUES(?,?,?,?,?,?)");

            ps.setString(1, bean.getUserID());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());

            rows = ps.executeUpdate();

            ps.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return rows;
    }
 // Scenario 8
    public int addUser_2(UserBean bean) {

        int rows = 0;

        try {

            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO USERS VALUES(?,?,?,?,?,?)");

            ps.setString(1, bean.getUserID());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());

            rows = ps.executeUpdate();

            con.commit();

            ps.close();

        } catch(Exception e) {

            try {
                con.rollback();
            } catch(Exception ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        }

        return rows;
    }
 // Scenario 9
    public ArrayList<UserBean> getUsers(String userType) {

        ArrayList<UserBean> list = new ArrayList<UserBean>();

        try {

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM USERS WHERE USERTYPE=?");

            ps.setString(1, userType);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                UserBean bean = new UserBean();

                bean.setUserID(rs.getString("USERID"));
                bean.setPassword(rs.getString("PASSWORD"));
                bean.setName(rs.getString("NAME"));
                bean.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
                bean.setLockStatus(rs.getInt("LOCKSTATUS"));
                bean.setUserType(rs.getString("USERTYPE"));

                list.add(bean);
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
 // Scenario 10
    public ArrayList<UserBean> storeAllRecords() {

        ArrayList<UserBean> list = new ArrayList<UserBean>();

        try {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM USERS");

            while (rs.next()) {

                UserBean bean = new UserBean();

                bean.setUserID(rs.getString("USERID"));
                bean.setPassword(rs.getString("PASSWORD"));
                bean.setName(rs.getString("NAME"));
                bean.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
                bean.setLockStatus(rs.getInt("LOCKSTATUS"));
                bean.setUserType(rs.getString("USERTYPE"));

                list.add(bean);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
 // Scenario 11
    public ArrayList<String> getNames() {

        ArrayList<String> list = new ArrayList<String>();

        try {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT NAME FROM USERS");

            while (rs.next()) {

                list.add(rs.getString("NAME"));

            }

            rs.close();
            st.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}