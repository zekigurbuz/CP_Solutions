import java.math.BigInteger;

public class E387 {
	public static void main(String[] args) {
		BigInteger total = new BigInteger("0");
		double x = Math.pow(10, 14);
		for (long i = 11; i < x; i++) {
			int a = sumDigits(i);
			String la = Long.toString(i);
			Long l = Long.parseLong(la.substring(0,la.length() - 1));
			if (i % a == 0 && isPrime(a) && isPrime(l)) {
				total = total.add(new BigInteger(Long.toString(i)));
			}
			System.out.println(i);
		}
		System.out.println(total.toString());
	}
	public static boolean isPrime(long i) {
		if (i == 2 || i == 3) return true;
		if (i % 3 == 0 || i % 2 == 0 || i == 1) return false;
		long j = 5;
		long w = 2;
		while (j * j <= i)
		{	
		if (i % j == 0) return false;
		j += w;
		w = 6 - w;
		}
		return true;
	}
	public static int sumDigits(long n) {
		int total = 0;
		while (n > 0) {
			total += n % 10;
			n /= 10;
		}
		return total;
	}
}
