import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class kvass_and_the_fair_nut {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		long t = 0;
		long s = file.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = file.nextLong();
			t += a[i];
		}
		if (t < s) {
			System.out.println(-1);
		}
		else {
			Arrays.sort(a);
			long min = a[0];
			for (int i = 0; i < n; i++) {
				long dif = a[i] - min;
				if (s <= dif) s = 0;
				else s -= dif;
				if (s==0) break;
			}
			if (s==0) System.out.println(min);
			else {
				if (s % n == 0) {
					System.out.println(min-s/n);
				}
				else {
					System.out.println(min-s/n-1);
				}
			}
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
		new kvass_and_the_fair_nut().run();
	}
}