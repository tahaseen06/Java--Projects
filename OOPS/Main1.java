package OOPS;

public class Main1 {
	public static void main(String[] args) {

        Animal a = new Animal();

        a.eat();
        a.sleep();

        System.out.println();

        Bird b = new Bird();

        b.eat();
        b.sleep();
        b.fly();
    }
}
