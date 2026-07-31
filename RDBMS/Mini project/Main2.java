package student;

public class Main2 {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        int attempts = dao.getIncorrectAttempts("AB1001");

        System.out.println("Incorrect Attempts : " + attempts);
    }
}
