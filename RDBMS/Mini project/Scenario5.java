package student;

public class Scenario5 {
	public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        int rows = dao.changeName("RS1003", "Karthik");

        if (rows > 0) {
            System.out.println("Name Updated Successfully");
        } else {
            System.out.println("User Not Found");
        }

    }
}
