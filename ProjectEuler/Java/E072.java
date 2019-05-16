
public class E072 {
	public static void main(String[] args) {
		int total = 0;
		for (int d = 2; d <= 1000000; d++) {
			for (int n = 1; n < d; n++) {
				if (d % 2 == 0 && n % 2 == 0) continue;
				if (isPrime(d)) {
					total += d - n;
					break;
				}
				if (HCF(n,d) == 1)  {
					total++;
				}
			}
			System.out.println(d);
		}
		System.out.println(total);
	}
	public static int HCF(int n , int d) {
		int hcf = 1;
		for (int i = n; i >= 1; i--) {
			if (d % i == 0 && n % i == 0) {
				hcf = i;
				break;
			}
		}
		return hcf;
	}
	public static boolean isPrime(int i) {
		if (i == 3) return true;
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
