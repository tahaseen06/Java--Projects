package student;

import java.util.ArrayList;

public class Scenario11 {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        ArrayList<String> list = dao.getNames();

        System.out.println("Names of all Users:");

        for (String name : list) {
            System.out.println(name);
        }
    }
}