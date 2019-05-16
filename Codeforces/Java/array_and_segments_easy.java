import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class array_and_segments_easy {

	public static void main(String[] args) throws Exception {
		new array_and_segments_easy().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		int m = file.nextInt();
		int[] a = new int[n];
		int[][] d = new int[m][2];
		for (int i = 0; i < n; i++) a[i] = file.nextInt();
		int[] p = Arrays.copyOf(a, n);
		HashMap<Integer, HashSet<Integer>> tm = new HashMap<>();
		for (int i = 0; i < n; i++) tm.put(i, new HashSet<Integer>());
		for (int i = 0; i < m; i++) {
			d[i][0] = file.nextInt() - 1;
			d[i][1] = file.nextInt() - 1;
			for (int j = d[i][0]; j <= d[i][1]; j++) {
				p[j]--;
				tm.get(j).add(i);
			}
		}
		int best = 0;
		int numq = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				best = Math.max(best, Math.abs(a[i] - a[j]));
			}
		}
		HashSet<Integer> qs = new HashSet<>();
		if (m > 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int b1 = p[i];
					int b2 = p[j];
					HashSet<Integer> c1 = (HashSet<Integer>) tm.get(i).clone();
					HashSet<Integer> c2 = (HashSet<Integer>) tm.get(j).clone();
					int s1 = c1.size();
					c1.retainAll(c2);
					b1 += s1 - c1.size();
					if (best < b1 - b2) {
						best = b1 - b2;
						qs = (HashSet<Integer>) c2.clone();
						numq = qs.size();
					}
				}
			}
			System.out.println(best);
			System.out.println(numq);
			Iterator<Integer> i = qs.iterator();
			boolean f = false;
			while (i.hasNext()) {
				if (!f) {
					f = true;
				}
				else {
					System.out.print(" ");
				}
				System.out.print(i.next() + 1);
			}
			System.out.println();
		}
		else {
			System.out.println(best);
			System.out.println(0);
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
