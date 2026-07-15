package methodreference;

public class TestPrime {
	public static void main(String[] args) {

        PrimeCheck p = PrimeNumber::new;

        p.create(17);
        p.create(20);
    }
}
