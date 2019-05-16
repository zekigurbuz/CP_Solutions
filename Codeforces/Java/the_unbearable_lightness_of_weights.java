import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class the_unbearable_lightness_of_weights {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		int[] a = new int[n];
		int s = 0;
		for (int i = 0; i < n; i++) {
			a[i] = file.nextInt();
			s += a[i];
		}
		int[][] dp = new int[n][s];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < s; j++) {
				if (i == 0 || j == 0) continue;
				int left = j - a[i];
				if (left < 0) continue;
				dp[i][j] = 1 + dp[i-1][left];
			}
		}
		for (int[] i : dp) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println(dp[n-1][s-1]);
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
		new the_unbearable_lightness_of_weights().run();
	}
}