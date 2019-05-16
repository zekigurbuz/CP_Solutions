
public class E010 {
	public static void main(String[] args) {
		long total = 0L;
		for (int i = 1; i < 2000000; i++) {
			if (isPrime(i)) total += i;
			if (isPrime(i)) System.out.println(i);
		}
		System.out.println(Long.toString(total));
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
