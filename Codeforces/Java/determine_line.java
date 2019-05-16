import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class determine_line {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		ArrayList<TreeSet<Integer>> t = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			t.add(new TreeSet<Integer>());
			int a = file.nextInt();
			for (int j = 0; j < a; j++) {
				int b = file.nextInt();
				t.get(i).add(b);
			}
		}
		for (int i = 1; i < n; i++) {
			t.get(0).retainAll(t.get(i));
		}
		System.out.println(t.get(0).toString().replaceAll("[\\[\\],]", ""));
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
		new determine_line().run();
	}
}