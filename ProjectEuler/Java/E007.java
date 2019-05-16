import java.math.BigInteger;
import java.util.ArrayList;

public class E007 {
	public static void main(String[] args) {
		ArrayList<Long> primes = new ArrayList();
		primes.add(2L);
		long whatWeAreAt = 3;
		while(primes.size() < 10001) {
			if (isPrime(whatWeAreAt)) {
				primes.add(whatWeAreAt);
			}
			whatWeAreAt++;
		}
		System.out.println(primes.get(primes.size() - 1));
	}
	public static boolean isPrime(long n) {
		if (n == 2 || n == 3) return true;
		if (n % 2 == 0 || n % 3 == 0) return false;
		long i = 5L;
		long w = 2L;
		while (i * i <= n) {
			if (n % i == 0) return false;
			i += w;
			w = 6 - w;
		}
		return true;
	}
}
