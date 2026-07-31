package student;

public class Scenario6 {
	public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        int rows = dao.changePassword("NewPass123");

        if (rows > 0) {
            System.out.println("Password Updated Successfully");
        } else {
            System.out.println("Password Update Failed");
        }

    }
}
