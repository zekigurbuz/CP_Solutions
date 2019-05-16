import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class disturbed_people {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		int[] arr = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++) arr[i] = file.nextInt();
		for (int i = 1; i < n - 1; i++) {
			if (arr[i-1] == 1 && arr[i+1] == 1 && arr[i] == 0) {
				arr[i-1] = 0;
				arr[i+1] = 0;
				ans++;
			}
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
		new disturbed_people().run();
	}
}