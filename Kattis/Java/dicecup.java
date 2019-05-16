
import java.io.*;
import java.util.*;

class dicecup {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int d1 = file.nextInt();
		int d2 = file.nextInt();
		LinkedHashMap<Integer, Integer> probs = new LinkedHashMap<>();
		for (int i = 1; i <= d1 + d2; i++) {
			probs.put(i, 0);
		}
		int highest = 0;
		for (int i = 1; i <= d1; i++) {
			for (int j = 1; j <= d2; j++) {
				probs.put(i + j, probs.get(i + j) + 1);
				if (probs.get(i + j) > highest) {
					highest = probs.get(i + j);
				}
			}
		}
		for (int i : probs.keySet()) {
			if (probs.get(i) == highest) {
				System.out.println(i);
			}
		}
	}
}
