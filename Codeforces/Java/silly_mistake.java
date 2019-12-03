import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class silly_mistake {

	public static void main(String[] args) throws Exception {
		new silly_mistake().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> seenToday = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		boolean works = true;
		int su = 0;
		for (int i = 0; i < n; i++) {
			int x = file.nextInt();
			if (x < 0) {
				x = -x;
				if (!hs.contains(x)) {
					works = false;
					break;
				}
				hs.remove(x);
				if (hs.isEmpty()) {
					seenToday.clear();
					al.add(i + 1 - su);
					su = i + 1;
				}
			}
			else {
				if (hs.contains(x)) {
					works = false;
					break;
				}
				if (seenToday.contains(x)) {
					works = false;
					break;
				}
				seenToday.add(x);
				hs.add(x);
			}
		}
		if (!hs.isEmpty()) works = false;
		if (works) {
			file.out.println(al.size());
			for (int i = 0; i < al.size(); i++) {
				if (i > 0) file.out.print(" ");
				file.out.print(al.get(i));
			}
			file.out.println();
		}
		else {
			file.out.println(-1);
		}
		file.out.flush();
		file.out.close();
	}

	public static long mod(long n, long mod) {
		return (n % mod + mod) % mod;
	}

	public static long pow(long n, long p, long mod) {
		if (p == 0L)
			return mod(1L, mod);
		if (p == 1L)
			return mod(n, mod);
		long t = mod(pow(n, p >> 1, mod), mod);
		if (p % 2L == 0L) {
			return mod(t * t, mod);
		}
		t = mod(t * t, mod);
		t = mod(t * n, mod);
		return mod(t, mod);
	}

	public static long pow(long n, long p) {
		return pow(n, p, Long.MAX_VALUE);
	}

	public static long gcd(long x, long y) {
		if (x == 0)
			return y;
		return gcd(y % x, x);
	}

	public static long lcm(long x, long y) {
		return x / gcd(x, y) * y;
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

	public static class Pair<A, B> implements Comparable {
		public A fi;
		public B se;

		public Pair(A fi, B se) {
			this.fi = fi;
			this.se = se;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Pair<?, ?> p = (Pair<?, ?>) o;
			if (!fi.equals(p.fi))
				return false;
			return se.equals(p.se);
		}

		@Override
		public int hashCode() {
			return 31 * fi.hashCode() + se.hashCode();
		}

		@Override
		public String toString() {
			return fi.toString() + " " + se.toString();
		}

		public static <A, B> Pair<A, B> of(A a, B b) {
			return new Pair<A, B>(a, b);
		}

		public int compareTo(Object o) {
			Pair<?, ?> p = (Pair<?, ?>) o;
			if (fi.equals(p.fi))
				return ((Comparable) se).compareTo(p.se);
			return ((Comparable) fi).compareTo(p.fi);
		}
	}

	public static class FastIO {
		BufferedReader br;
		StringTokenizer st;
		PrintWriter out;

		public FastIO() {
			br = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
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

		void print(Object o) {
			out.print(o);
		}

		void println(Object o) {
			out.println(o);
		}

		void printf(String s, Object... o) {
			out.printf(s, o);
		}
	}
}
