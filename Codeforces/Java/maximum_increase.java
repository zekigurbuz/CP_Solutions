import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class maximum_increase {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = file.nextInt();
		}
		int[] dp = new int[n];
		dp[0] = 1; int max = 1;
		for (int i = 1; i < n; i++) {
			if (a[i] > a[i-1]) {
				dp[i] = dp[i-1] + 1;
			}
			else {
				dp[i] = 1;
			}
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
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
		new maximum_increase().run();
	}
}