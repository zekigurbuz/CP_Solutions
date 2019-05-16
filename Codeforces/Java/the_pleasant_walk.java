import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class the_pleasant_walk {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		int k = file.nextInt();
		int prev = 0;
		int max = 1;
		int cur = 0;
		while (n-->0) {
			int next = file.nextInt();
			if (next == prev) {
				max = Math.max(cur, max);
				cur = 1;
			}
			else {
				cur++;
				prev = next;
			}
		}
		System.out.println(Math.max(max, cur));
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
		new the_pleasant_walk().run();
	}
}