package student;

public class Scenario8 {
	public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        UserBean bean = new UserBean();

        bean.setUserID("VK1005");
        bean.setPassword("VK1005");
        bean.setName("Vikas");
        bean.setIncorrectAttempts(0);
        bean.setLockStatus(0);
        bean.setUserType("Employee");

        int rows = dao.addUser_2(bean);

        if(rows > 0)
            System.out.println("User Added Successfully using Transaction");
        else
            System.out.println("Failed");
    }

}
