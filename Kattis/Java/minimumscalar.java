import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class minimumscalar {

	public static void main(String[] args) throws Exception {
		new minimumscalar().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int t = file.nextInt();
		for (int q = 1; q <= t; q++) {
			int n = file.nextInt();
			long[] a1 = new long[n];
			long[] a2 = new long[n];
			for (int i = 0; i < n; i++) {
				a1[i] = file.nextLong();
			}
			for (int i = 0; i < n; i++) {
				a2[i] = file.nextLong();
			}
			Arrays.sort(a1);
			Arrays.sort(a2);
			for (int i = 0; i < n / 2; i++) {
				a1[i] ^= a1[n-i-1];
				a1[n-i-1] ^= a1[i];
				a1[i] ^= a1[n-i-1];
			}
			long min = Long.MAX_VALUE;
			long cur = 0;
			for (int i = 0; i < n; i++) {
				cur += a1[i] * a2[i];
			}
			min = Math.min(min, cur);
			Arrays.sort(a1);
			for (int i = 0; i < n / 2; i++) {
				a2[i] ^= a2[n-i-1];
				a2[n-i-1] ^= a2[i];
				a2[i] ^= a2[n-i-1];
			}
			cur = 0;
			for (int i = 0; i < n; i++) {
				cur += a1[i] * a2[i];
			}
			min = Math.min(min, cur);
			System.out.println("Case #" + q + ": " + min);
		}
	}

	public static class FastIO {
		BufferedReader br;
		StringTokenizer st;

		public FastIO() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static long pow(long n, long p, long mod) {
		if (p == 0)
			return 1;
		if (p == 1)
			return n % mod;
		if (p % 2 == 0) {
			long temp = pow(n, p / 2, mod);
			return (temp * temp) % mod;
		} else {
			long temp = pow(n, p / 2, mod);
			temp = (temp * temp) % mod;
			return (temp * n) % mod;

		}
	}

	public static long pow(long n, long p) {
		if (p == 0)
			return 1;
		if (p == 1)
			return n;
		if (p % 2 == 0) {
			long temp = pow(n, p / 2);
			return (temp * temp);
		} else {
			long temp = pow(n, p / 2);
			temp = (temp * temp);
			return (temp * n);

		}
	}

	public static long gcd(long x, long y) {
		if (x == 0)
			return y;
		else
			return gcd(y % x, x);
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
}
