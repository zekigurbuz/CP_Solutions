import java.util.*;
import java.io.*;

public class good_array {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		long[][] a = new long[n][3];
		for (int i = 0; i < n; i++) {
			a[i][0] = file.nextLong();
			a[i][1] = a[i][0] + (i==0?0:a[i-1][1]);
		}
		for (int i = 0; i < n; i++) {
			a[i][2] = a[n-1][1] - a[i][0];
		}
		for (long[] i : a) System.out.println(Arrays.toString(i));
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
		new good_array().run();
	}
}