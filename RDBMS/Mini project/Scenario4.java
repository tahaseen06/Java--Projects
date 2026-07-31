package student;

import java.util.ArrayList;

public class Scenario4 {
	public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        ArrayList<String> list = dao.getLockStatus();

        System.out.println("Users with Lock Status = 0");

        for (String user : list) {
            System.out.println(user);
        }
    }
}
