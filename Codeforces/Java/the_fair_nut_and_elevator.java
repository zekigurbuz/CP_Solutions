import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class the_fair_nut_and_elevator {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		int[] a = new int[n];
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) a[i] = file.nextInt();
		for (int i = 0; i < n; i++) {
			int cur = 0;
			for (int j = 1; j < n; j++) {
				cur += (Math.abs(i-j) + j + i) * 2 * a[j];
			}
			ans = Math.min(ans, cur);
		}
		System.out.println(ans);
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
		new the_fair_nut_and_elevator().run();
	}
}