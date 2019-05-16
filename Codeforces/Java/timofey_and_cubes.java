import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class timofey_and_cubes {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		int[] arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = file.nextInt();
		}
		for (int i = 1; i <= n/2; i++) {
			if ((i&1)>0) {
				int t = arr[i];
				arr[i] = arr[n-i+1];
				arr[n-i+1] = t;
			}
		}
		for (int i = 1; i <= n; i++) System.out.print(arr[i] + " ");
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
		new timofey_and_cubes().run();
	}
}