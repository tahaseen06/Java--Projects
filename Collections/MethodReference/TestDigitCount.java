package methodreference;

public class TestDigitCount {
	public static void main(String[] args) {

        DigitCount d = DigitUtil::digitCount;

        System.out.println("Digits = " + d.count(123456));
    }
}
