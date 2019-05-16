
public class E009 {
	public static void main(String[] args) {
		boolean found = false;
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				for (int k = 1; k < 1000; k++) {
					double aS = Math.pow(i, 2);
					double bS = Math.pow(j, 2);
					double cS = Math.pow(k, 2);
					if (aS + bS == cS && i + j + k == 1000) {
						System.out.println(i * j * k);
						found = true;
					}
					if (found) break;
				}
				if (found) break;
			}
			if (found) break;
		}
	}
}
