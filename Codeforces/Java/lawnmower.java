import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class lawnmower {

	public static void main(String[] args) throws Exception {
		new lawnmower().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		int m = file.nextInt();
		char[][] c = new char[n][m];
		for (int i = 0; i < n; i++) {
			c[i] = file.next().toCharArray();
		}
		int[] mc = new int[n];
		Arrays.fill(mc, -1); int lc = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = m - 1; j >= 0; j--) {
					if (c[i][j] == 'W') {
						mc[i] = j;
						break;
					}
				}
			}
			else {
				for (int j = 0; j < m; j++) {
					if (c[i][j] == 'W') {
						mc[i] = j;
						break;
					}
				}
			}
		}
		for (int i = n - 1; i >= 0; i--) {if (mc[i] == -1) {
			lc = n-i;
		} else break;}
		int ans = n - 1 + mc[0] - lc;
		int prev = mc[0];
		for (int i = 1; i < n; i++) {
			if (mc[i-1] != -1) {
				prev = mc[i-1];
			}
			if (mc[i] != -1) {
				ans += Math.abs(mc[i] - prev);
			}
		}
		System.out.println(Math.max(ans, 0));
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
