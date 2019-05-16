import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class knights_of_a_polygonal_table {

	public static void main(String[] args) throws Exception {
		new knights_of_a_polygonal_table().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		int k = file.nextInt();
		state = 0;
		Knight[] kn = new Knight[n];
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = file.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = file.nextInt();
		}
		for (int i = 0; i < n; i++) {
			kn[i] = new Knight(i, a[i], b[i]);
		}
		Arrays.sort(kn);
		state = 1;
		long[] ans = new long[n];
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				kn[i].pq.addAll(kn[i-1].pq);
				ans[kn[i].id] += ans[kn[i-1].id];
				while (kn[i].pq.size() > k) {
					ans[kn[i].id] -= kn[i].pq.poll().val;
				}
			}
			kn[i].pq.add(kn[i]);
			ans[kn[i].id] += kn[i].val;
		}
		for (int i = 0; i < n; i++) {
			if (i > 0) System.out.print(" ");
			System.out.print(ans[i]);
		}
		System.out.println();
	}
	static int state;
	
	public static class Knight implements Comparable<Knight> {
		long pow, val;
		int id;
		PriorityQueue<Knight> pq;
		public Knight(int id, long pow, long val) {
			this.id = id;
			this.pow = pow;
			this.val = val;
			pq = new PriorityQueue<>();
		}
		public int compareTo(Knight o) {
			if (state == 0)
			return Long.compare(pow, o.pow);
			else if (state == 1)
			return Long.compare(val, o.val);
			else
			return Integer.compare(id, o.id);
		}
		public String toString() {
			return id + "";
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
