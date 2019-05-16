import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class taymyr_is_calling_you {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		int m = file.nextInt();
		int z = file.nextInt();
		int ans = 0;
		for (int i = 1; i <= z; i++) {
			if (i % n == 0 && i % m == 0) ans++;
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
		new taymyr_is_calling_you().run();
	}
}