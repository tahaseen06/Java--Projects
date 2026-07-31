package student;

import java.util.ArrayList;
public class Scenario9 {
	public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        ArrayList<UserBean> list = dao.getUsers("Employee");

        for (UserBean bean : list) {

            System.out.println(bean.getUserID() + " "
                    + bean.getName() + " "
                    + bean.getUserType());
        }
    }
}
