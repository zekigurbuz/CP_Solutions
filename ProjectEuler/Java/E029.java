import java.util.TreeSet;

public class E029 {
	public static void main(String[] args) {
		TreeSet<String> combs = new TreeSet();
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				combs.add(Double.toString(Math.pow(i, j)));
			}
		}
		System.out.println(combs.size());
	}
}
