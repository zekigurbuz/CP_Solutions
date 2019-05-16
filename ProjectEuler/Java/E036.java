
public class E036 {
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 1; i < 1000000; i++) {
			String forwards10 = Integer.toString(i);
			String forwards2 = Integer.toBinaryString(i);
			StringBuilder r1 = new StringBuilder(forwards10);
			StringBuilder r2 = new StringBuilder(forwards2);
			r1 = r1.reverse();
			r2 = r2.reverse();
			String backwards10 = r1.toString();
			String backwards2 = r2.toString();
			if (forwards10.equals(backwards10) && forwards2.equals(backwards2)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
