import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class bank {

	public static void main(String[] args) throws Exception {
		new bank().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		int t = file.nextInt();
		ArrayList<Person> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(new Person(file.nextInt(), file.nextInt()));
		}
		int ans = 0;
		Collections.sort(a);
		for (int i = 0; i < t; i++) {
			for (int j = a.size() - 1; j >= 0; j--) {
				if (a.get(j).t < i) a.remove(j);
			}
			Collections.sort(a);
			if (!a.isEmpty()) ans += a.remove(0).s;
			System.out.println(a);
		}
		System.out.println(ans);
	}
	public class Person implements Comparable<Person> {
		int t;
		int s;
		public Person(int s, int t) {
			this.s = s;
			this.t = t;
		}
		public int compareTo(Person o) {
			return o.s - s;
		}
		public String toString() {
			return s + ":" + t;
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
