import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class the_fair_nut_and_string {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		char[] c = file.nextLine().trim().toCharArray();
		int n = c.length;
		long[] dp = new long[n+1];
		long[] sum = new long[n+1];
		long mod = 1000000007;
		int bind = 0;
		sum[0] = 1;
		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			if (c[i]=='b') bind = i+1;
			else if (c[i]=='a') dp[i+1] = sum[bind];
			sum[i+1] = (sum[i]%mod+dp[i+1]%mod) % mod;
		}
		System.out.println(sum[n]-1);
	}

	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}

	public static void main(String[] args) throws Exception {
		new the_fair_nut_and_string().run();
	}
}