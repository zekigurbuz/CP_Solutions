import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class petya_and_origami {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		long n = file.nextLong();
		long k = file.nextLong();
		long ans = 0;
		for (long a = 2; a <= 8; a += 3) {
			long t = a * n;
			t = (long) Math.ceil((double)t/k);
			ans += t;
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
		new petya_and_origami().run();
	}
}