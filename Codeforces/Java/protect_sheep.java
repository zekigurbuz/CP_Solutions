import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class protect_sheep {

	public static void main(String[] args) throws Exception {
		new protect_sheep().run();
	}
	int r, c;

	public void run() throws Exception {
		FastIO file = new FastIO();
		r = file.nextInt();
		c = file.nextInt();
		char[][] mat = new char[r][c];
		for (int i = 0; i < r; i++) {
			mat[i] = file.nextLine().toCharArray();
		}
		boolean works = true;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (mat[i][j] == 'S') {
					if (ib(i + 1, j)) {
						if (mat[i+1][j] == 'W') {
							works = false;
							break;
						}
						if (mat[i+1][j] == '.') mat[i+1][j] = 'D';
					}
					if (ib(i - 1, j)) {
						if (mat[i-1][j] == 'W') {
							works = false;
							break;
						}
						if (mat[i-1][j] == '.') mat[i-1][j] = 'D';
					}
					if (ib(i, j + 1)) {
						if (mat[i][j+1] == 'W') {
							works = false;
							break;
						}
						if (mat[i][j+1] == '.') mat[i][j+1] = 'D';
					}
					if (ib(i, j - 1)) {
						if (mat[i][j-1] == 'W') {
							works = false;
							break;
						}
						if (mat[i][j-1] == '.') mat[i][j-1] = 'D';
					}
				}
			}
		}
		if (works) {
			System.out.println("Yes");
			for (char[] c : mat) System.out.println(c);
		}
		else {
			System.out.println("No");
		}
	}

	public boolean ib(int x, int y) {
		return x >= 0 && y >= 0 && x < r && y < c;
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
