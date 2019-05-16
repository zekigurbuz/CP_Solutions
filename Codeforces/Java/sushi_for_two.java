import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class sushi_for_two {

	public static void main(String[] args) throws Exception {
		new sushi_for_two().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		ArrayList<Integer> l = new ArrayList<>();
		ArrayList<Boolean> b = new ArrayList<>();
		int n = file.nextInt();
		int len = 1;
		int prev = file.nextInt();
		boolean current = prev == 1;
		for (int i = 1; i < n; i++) {
			int c = file.nextInt();
			if ((c == 1) != (current)) {
				b.add(current);
				l.add(len);
				len = 1;
				prev = c;
				current = c == 1;
			}
			else {
				len++;
			}
		}
		l.add(len);
		b.add(current);
		int m = 0;
		for (int i = 1; i < l.size(); i++) {
			if (b.get(i) != b.get(i-1)) {
				m = Math.max(m, Math.min(l.get(i), l.get(i-1)) * 2);
			}
		}
		System.out.println(m);
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
