import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class phone_numbers {

	public static void main(String[] args) throws Exception {
		new phone_numbers().run();
	}
	
	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		Guy[] g = new Guy[n];
		for (int i = 0; i < n; i++) {
			int q = file.nextInt();
			String s = file.next();
			g[i] = new Guy(s, i);
			while (q-->0) {
				int[] a = Arrays.stream(file.nextLine().replaceAll("\\D+", "").trim().split("")).mapToInt(Integer::parseInt).toArray();
				if (a[0] == a[1] && a[0] == a[2] && a[0] == a[3] && a[0] == a[4] && a[0] == a[5]) {
					g[i].a++;
				}
				else if (a[0] > a[1] && a[1] > a[2] && a[2] > a[3] && a[3] > a[4] && a[4] > a[5]) {
					g[i].b++;
				}
				else {
					g[i].c++;
				}
			}
		}
		System.out.print("If you want to call a taxi, you should call: ");
		ArrayList<Guy> gg = new ArrayList<>();
		state = 0;
		Arrays.sort(g);
		for (int i = 0; i < n; i++) {
			if (g[i].a == g[0].a) gg.add(g[i]);
			else break;
		}
		state = 3;
		Collections.sort(gg);
		String ss = gg.toString().replaceAll("[\\[\\], ]+", ", ").trim();
		ss = ss.substring(2, ss.length() - 1);
		System.out.print(ss.trim());
		System.out.println(".");
		System.out.print("If you want to order a pizza, you should call: ");
		gg = new ArrayList<>();
		state = 1;
		Arrays.sort(g);
		for (int i = 0; i < n; i++) {
			if (g[i].b == g[0].b) gg.add(g[i]);
			else break;
		}
		state = 3;
		Collections.sort(gg);
		ss = gg.toString().replaceAll("[\\[\\], ]+", ", ").trim();
		ss = ss.substring(2, ss.length() - 1);
		System.out.print(ss.trim());
		System.out.println(".");
		System.out.print("If you want to go to a cafe with a wonderful girl, you should call: ");
		gg = new ArrayList<>();
		state = 2;
		Arrays.sort(g);
		for (int i = 0; i < n; i++) {
			if (g[i].c == g[0].c) gg.add(g[i]);
			else break;
		}
		state = 3;
		Collections.sort(gg);
		ss = gg.toString().replaceAll("[\\[\\], ]+", ", ").trim();
		ss = ss.substring(2, ss.length() - 1);
		System.out.print(ss.trim());
		System.out.println(".");
	}
	int state = 0;
	public class Guy implements Comparable<Guy> {
		int a, b, c, d;
		String name;
		public Guy(String s, int d) {
			name = s;
			this.d = d;
		}
		public int compareTo(Guy o) {
			switch(state) {
			case 0: return o.a - a;
			case 1: return o.b - b;
			case 2: return o.c - c;
			case 3: return d - o.d;
			default: return 0;
			}
		}
		public String toString() {
			return name;
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
