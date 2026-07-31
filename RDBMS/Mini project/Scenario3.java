package student;

public class Scenario3 {
	public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        int rows = dao.changeUserType("TA1002");

        if (rows > 0) {
            System.out.println("User Type Updated Successfully");
        } else {
            System.out.println("User Not Found");
        }
    }
}
