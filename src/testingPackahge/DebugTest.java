package testingPackahge;

public class DebugTest {

	public static void main(String[] args) {

		int term = 10;
		float intrest = 10;
		double amount = 10000;
		double intrestAmount = calcIntrest(term, intrest, amount);
		double totalAmount = amount + intrestAmount;
		System.out.println("intrest : " + totalAmount);
	}

	static double calcIntrest(int term, float intrest, double amount) {

		double res = term * intrest * amount;
		res = res / 100;
		return res;
	}
}
