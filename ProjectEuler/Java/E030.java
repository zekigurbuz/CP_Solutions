import java.math.BigInteger;

public class E030 {
	public static void main(String[] args) {
		BigInteger totalSum = new BigInteger("0");
		for (long i = 2; i < 999999; i++) {
			if (digitSum(i) == i) {
				totalSum = totalSum.add(new BigInteger(Long.toString(i)));
			}
		}
		System.out.println(totalSum.toString());
	}
	public static long digitSum(long n) {
		long total = 0;
		while (n > 0) {
			total += Math.pow(n % 10, 5);
			n /= 10;
		}
		return total;
	}
}
