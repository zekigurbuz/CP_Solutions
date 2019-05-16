import java.math.BigInteger;
import java.util.ArrayList;

public class E037 {
	public static void main(String[] args) {
		BigInteger totalSum = new BigInteger("0");
		int count = 0;
		for (int i = 10; i < Integer.MAX_VALUE && count < 11; i++) {
			String str = Integer.toString(i);
			boolean works = true;
			for (int j = 0; j < str.length(); j++) {
				int one = Integer.parseInt(str.substring(0, j + 1));
				int two = Integer.parseInt(str.substring(str.length() - j - 1));
				if (!isPrime(one) || !isPrime(two) || !isPrime(i)) works = false;
			}
			if (works)  {
				System.out.println(i);
				count++;
				totalSum = totalSum.add(new BigInteger(str));
			}
		}
		System.out.println(totalSum.toString());
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
