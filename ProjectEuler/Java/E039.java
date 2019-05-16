
public class E039 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j <= i; j++) {
				for (int x = 1; x <= j; x++) {
					if (i + j + x > 1000) continue;
					if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(x, 2) || Math.pow(x, 2) + Math.pow(j, 2) == Math.pow(i, 2) || Math.pow(i, 2) + Math.pow(x, 2) == Math.pow(j, 2)) {
						total++;
						System.out.println(j + " " + i + " " + x);
					}
				}
			}
		}
		System.out.println(total);
	}
}
