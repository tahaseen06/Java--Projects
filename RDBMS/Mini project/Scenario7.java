package student;

public class Scenario7 {
	 public static void main(String[] args) {

	        DAOClass dao = new DAOClass();

	        UserBean bean = new UserBean();

	        bean.setUserID("AR1004");
	        bean.setPassword("AR1004");
	        bean.setName("Arun");
	        bean.setIncorrectAttempts(0);
	        bean.setLockStatus(0);
	        bean.setUserType("Employee");

	        int rows = dao.addUser_1(bean);

	        if(rows > 0)
	            System.out.println("User Added Successfully");
	        else
	            System.out.println("User Not Added");
	    }
}
