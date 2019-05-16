import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class easyproblem {

	public static void main(String[] args) throws Exception {
		new easyproblem().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		char[] c = (" " +file.nextLine()).toCharArray();
		long[] a = new long[n+1];
		long[][] dp = new long[n + 1][4];
		for (int i = 0; i < n; i++) {
			a[i+1] = file.nextLong();
			dp[i+1][0]=dp[i+1][1]=dp[i+1][2]=dp[i+1][3]=Long.MAX_VALUE;
		}
		dp[0][0] = 0; dp[0][1] = dp[0][2] = dp[0][3] = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				if (dp[i][j] == Long.MAX_VALUE) continue;
				dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + a[i+1]);
				if (j == 0) {
					if (c[i+1]=='h') dp[i+1][j+1]=Math.min(dp[i+1][j+1], dp[i][j]);
					else dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
				}
				else if (j == 1) {
					if (c[i+1]=='a') dp[i+1][j+1]=Math.min(dp[i+1][j+1], dp[i][j]);
					else dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]); 
				}
				else if (j == 2) {
					if (c[i+1]=='r') dp[i+1][j+1]=Math.min(dp[i+1][j+1], dp[i][j]);
					else dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
				}
				else {
					if (c[i+1]!='d') dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
				}
			}
		}
		System.out.println(Math.min(Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2]), dp[n][3]));
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