import java.math.BigInteger;

public class E048 {
	public static void main(String[] args) {
		BigInteger total = new BigInteger("0");
		for (int i = 1; i <= 1000; i++) {
			BigInteger ii = new BigInteger(Integer.toString(i));
			BigInteger res = new BigInteger(ii.toString());
			for (int j = 1; j < i; j++) {
				ii = ii.multiply(res);
			}
			total = total.add(ii);
		}
		System.out.println(total.toString().substring(total.toString().length() - 10));
	}
}
