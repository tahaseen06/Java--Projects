package student;

public class Main {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        String type = dao.getUserType("AB1001");

        if (type != null) {
            System.out.println("User Type : " + type);
        } else {
            System.out.println("User not found");
        }

    }

}