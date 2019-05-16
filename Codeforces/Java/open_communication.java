import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class open_communication {

	public static void main(String[] args) throws Exception {
		new open_communication().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		int m = file.nextInt();
		int[][] p1 = new int[n][2];
		int[][] p2 = new int[m][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				p1[i][j] = file.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 2; j++) {
				p2[i][j] = file.nextInt();
			}
		}
		TreeSet<Integer> ans = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			int a = 0;
			int b = 0;
			for(int j = 0; j < m; j++) {
				if (p1[i][0] == p2[j][0] && p1[i][1] == p2[j][1]) continue;
				if (p1[i][0] == p2[j][0] || p1[i][0] == p2[j][1]) a++;
				if (p1[i][1] == p2[j][1] || p1[i][1] == p2[j][0]) b++;
			}
			if (a == 0 && b > 0) ans.add(p1[i][1]);
			else if (a > 0 && b == 0) ans.add(p1[i][0]);
		}
		if (ans.size() == 1) {
			System.out.println(ans.last());
			System.exit(0);
		}
		ans.clear();
		for (int i = 0; i < m; i++) {
			int a = 0;
			int b = 0;
			for (int j = 0; j < n; j++) {
				if (p2[i][0] == p1[j][0] && p2[i][1] == p1[j][1]) continue;
				if (p2[i][0] == p1[j][0] || p2[i][0] == p1[j][1]) a++;
				if (p2[i][1] == p1[j][1] || p2[i][1] == p1[j][0]) b++;
			}
			if (a == 0 && b > 0) ans.add(p2[i][1]);
			else if (a > 0 && b == 0) ans.add(p2[i][0]);
		}
		if (ans.size() == 1) {
			System.out.println(ans.last());
			System.exit(0);
		}
		for (int i = 0; i < n; i++) {	
			boolean a = false;
			boolean b = false;
			for (int j = 1; j <= 9; j++) {
				for (int k = 1; k <= 9; k++) {
					for (int l = 0; l < m; l++) {
						if (j == p1[i][1] || k == p1[i][0]) continue;
						if (p2[l][0] == p1[i][0] && p2[l][1] == j) a = true;
						if (p2[l][0] == p1[i][1] && p2[l][1] == k) b = true;
					}
				}
			}
			if (a && b) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		for (int i = 0; i < m; i++) {	
			boolean a = false;
			boolean b = false;
			for (int j = 1; j <= 9; j++) {
				for (int k = 1; k <= 9; k++) {
					for (int l = 0; l < n; l++) {
						if (j == p2[i][1] || k == p2[i][0]) continue;
						if (p1[l][0] == p2[i][0] && p1[l][1] == j) a = true;
						if (p1[l][0] == p2[i][1] && p1[l][1] == k) b = true;
					}
				}
			}
			if (a && b) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		System.out.println(0);
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
