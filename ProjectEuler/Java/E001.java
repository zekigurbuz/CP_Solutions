public class E001 {
	public static void main(String[] args) {
		long sum = 0L;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(Long.toString(sum));
	}
}
