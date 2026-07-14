package Demo;

import test.Foundation;
public class Demo {
	public static void main(String[] args) {

        Foundation f = new Foundation();

        // System.out.println(f.var1); // Not accessible
        // System.out.println(f.var2); // Not accessible
        // System.out.println(f.var3); // Not accessible

        System.out.println(f.var4); // Accessible
    }
}
