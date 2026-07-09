package OOPS;

public class Apple extends Fruit{
	public Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}
