package student;

public class CallableDemo {

    public static void main(String[] args) {

        if (args.length != 1) {

            System.out.println("Usage:");
            System.out.println("java CallableDemo <EmpNo>");
            return;

        }

        DAOClass dao = new DAOClass();

        dao.getNetSalary(Integer.parseInt(args[0]));

    }

}