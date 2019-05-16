import java.util.HashMap;

public class E066 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> vals = new HashMap();
		for (int i = 1; i <= 1000; i++) {
			boolean found = false;
			if (Math.sqrt(i) % 1 == 0) continue;
			for (int x = 1; x < Integer.MAX_VALUE; x++) {
				for (int y = 1; y <= x; y++) {
					if (Math.pow(x, 2) - i * Math.pow(y, 2) == 1) {
						System.out.println(i);
						vals.put(i, x);
						found = true;
						if (found) break;
					}
					if (found) break;
				}
				if (found) break;
			}
		}
		int maxX = 0;
		for (int i = 1; i <= 1000; i++) {
			if (vals.containsKey(i) && vals.get(i) > maxX) maxX = vals.get(i);
		}
		System.out.println(maxX);
	}
}
