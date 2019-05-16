import java.util.*;
import java.io.*;

public class frog_jumping {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int t = file.nextInt();
		while (t-->0) {
			long a = file.nextLong();
			long b = file.nextLong();
			long k = file.nextLong();
			if (k%2==1) System.out.println((a-b)*(k/2)+a);
			else System.out.println((a-b) * (k/2));
		}
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
		new frog_jumping().run();
	}
}