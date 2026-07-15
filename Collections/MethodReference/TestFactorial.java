package Demo;

public class TestFactorial {

    public static void main(String[] args) {

        FactorialClass obj = new FactorialClass();

        Factorial f = obj::factorial;

        System.out.println("Factorial = " + f.fact(5));
    }
}
