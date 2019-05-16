
public class E004 {
	public static void main(String[] args) {
		long largest = 0L;
		for (int one = 100; one < 1000; one++) {
			for (int two = 100; two < 1000; two++) {
				long product = one * two;
				if (isPal(product) && product > largest) largest = product;
			}
		}
		System.out.println(largest);
	}
	public static boolean isPal(long l) {
		String x = Long.toString(l);
		StringBuilder rev = new StringBuilder(x);
		rev = rev.reverse();
		String reverse = rev.toString();
		return reverse.equals(x);
	}
}
