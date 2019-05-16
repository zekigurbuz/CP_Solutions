import java.util.ArrayList;

public class E023 {
	public static void main(String[] args) {
		ArrayList<Long> abundants = new ArrayList();
		for (long i = 1; i <= 28123; i++) {
			if (isAbundant(i)) abundants.add(i);
		}
		long sumTotal = 0;
		for (long x = 1; x <= 28123; x++) {
			boolean works = false;
			for (int i = 0; i < abundants.size(); i++) {
				for (int j = 0; j < abundants.size(); j++) {
					if (abundants.get(i) + abundants.get(j) == x) {
						works = true;
					}
					if (works) break;
				}
				if (works) break;
			}
			if (!works) sumTotal += x;
		}
		System.out.println(sumTotal);
	}
	public static boolean isAbundant(long n) {
		long total = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) total += i;
		}
		return (total > n);
	}
}
