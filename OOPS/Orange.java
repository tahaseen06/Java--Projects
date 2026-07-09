package OOPS;

public class Orange extends Fruit {
	public Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}
