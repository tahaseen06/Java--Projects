package Demo;
import java.util.ArrayList;
public class NumbersList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(10);
        list.add(15.5);
        list.add(22.75f);
        list.add(100L);

        System.out.println(list);
    }
}
