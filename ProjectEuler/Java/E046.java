import java.util.ArrayList;

public class E046 {
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList();
		for (int i = 1; i < 1000000; i++) {
			if (isPrime(i)) primes.add(i);
		}
		int inc = 33;
		while (true) {
			boolean works = false;
			for (int i = 0; i < 1; i++) {
				for (int j = 1; j < inc; j++) {
					if (primes.get(i) + 2 * Math.pow(j, 2) == inc) {
						works = true;
					}
				}
			}
			if (!works && !isPrime(inc)) break;
			inc += 2;
		}
		System.out.println(inc);
	}
	public static boolean isPrime(int i) {
		if (i == 2 || i == 3) return true;
		if (i % 3 == 0 || i % 2 == 0 || i == 1) return false;
		int j = 5;
		int w = 2;
		while (j * j <= i)
		{	
		if (i % j == 0) return false;
		j += w;
		w = 6 - w;
		}
		return true;
	}
}
