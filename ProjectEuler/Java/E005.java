
public class E005 {
	public static void main(String[] args) {
		long smallest = 20L;
		boolean found = false;
		while (!found) {
			boolean works = true;
			for (int i = 1; i <= 20; i++) {
				if (smallest % i != 0) works = false;
			}
			if (works == true) found = true;
			System.out.println(smallest);
			smallest+= 20;
		}
		System.out.println(smallest - 20);
	}
}
