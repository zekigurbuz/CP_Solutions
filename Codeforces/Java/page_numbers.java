import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class page_numbers {

	public static void main(String[] args) throws Exception {
		new page_numbers().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int[] line = Arrays.stream(file.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(line);
		ArrayList<Integer> a = new ArrayList<>(); for (int i : line) a.add(i);
		ArrayList<Range> r = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			boolean added = false;
			for (int j = 0; j < r.size(); j++) {
				if (r.get(j).r == a.get(i) - 1) {
					r.get(j).r++;
					added = true;
					break;
				}
				else if (r.get(j).l <= a.get(i) && r.get(j).r >= a.get(i)) {
					added = true;
					break;
				}
			}
			if (!added) {
				r.add(new Range(a.get(i), a.get(i)));
			}
		}
		for (int i = 0; i < r.size(); i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(r.get(i));
		}
		System.out.println();
	}
	public static class Range implements Comparable<Range> {
		int l, r;
		public Range(int l, int r) {
			this.l = l;
			this.r = r;
		}
		public int compareTo(Range o) {
			return l - o.l;
		}
		public String toString() {
			return (l == r) ? l + "" : l + "-" + r;
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
