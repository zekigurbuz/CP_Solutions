import java.math.BigInteger;

public class E025 {
	static BigInteger[] known;
	public static void main(String[] args) {
		known = new BigInteger[20000];
		known[0] = new BigInteger("0");
		known[1] = new BigInteger("1");
		known[2] = new BigInteger("1");
		for (int i = 3; i < known.length; i++) {
			known[i] = fib(i);
			if (known[i].toString().length() >= 1000) {
				System.out.println(i);
				break;
			}
		}
		
	}
	public static BigInteger fib(int n) {
		if (known[n] == null) {
			known[n] = fib(n - 1).add(fib(n - 2));
		}
		return known[n];
	}
}
