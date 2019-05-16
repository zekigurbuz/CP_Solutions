import java.util.ArrayList;
import java.util.Collections;

public class E035 {
	public static void main(String[] args) {
		long amount = 0;
		for (int i = 1; i < 1000000; i++) {
			boolean works = true;
			int tempI = i;
			ArrayList<Integer> digits = new ArrayList();
			while (tempI > 0) {
				digits.add(tempI % 10);
				tempI /= 10;
			}
			for (int j = 0; j < digits.size(); j++) {
				int sum = 0;
				int inc = 1;
				for (int x = digits.size() - 1; x >= 0; x--) {
					sum += digits.get(x) * inc;
					inc *= 10;
				}
				if (!isPrime(sum)) works = false;
				Collections.rotate(digits, 1);
			}
			if (works) amount++;
		}
		System.out.println(amount);
	}
	public static boolean isPrime(int i) {
		if (i == 2 || i == 3) return true;
		if (i % 3 == 0 || i % 2 == 0 || i == 1) return false;
		int j = 5;
		int w = 2;
		while (j * j <= i)
		{	
		if (i % j == 0) return false;
		j += w;
		w = 6 - w;
		}
		return true;
	}
}
