package student;

import java.util.ArrayList;
public class Scenario10 {
	public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        ArrayList<UserBean> list = dao.storeAllRecords();

        for (UserBean bean : list) {

            System.out.println(bean.getUserID() + " "
                    + bean.getPassword() + " "
                    + bean.getName() + " "
                    + bean.getIncorrectAttempts() + " "
                    + bean.getLockStatus() + " "
                    + bean.getUserType());
        }
    }
}

