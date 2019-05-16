import java.util.*;
import java.io.*;

public class personalized_cup {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		//a <= 5, b <= 20
		//every cell = * or letter
		//# of *s per rows should be +- 1
		//find min rows, then min cols
		int r = 100;
		int c = 100;
		int as = 0;
		char[] in = file.next().trim().toCharArray();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 20; j++) {
				if ((i < r || i==r&&j<c) && i * j >= in.length) {
					as = i * j - in.length;
					r = i;
					c = j;
				}
			}
		}
		System.out.println(r + " " + c);
		char [][] mat = new char[r][c];
		int ind = 0;
		int[] asterisks = new int[r];
		while (as > 0) {
			for (int i = 0; i < r && as > 0; i++) {
				asterisks[i]++;
				as--;
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < asterisks[i]; j++) {
				mat[i][j] = '*';
			}
			for (int j = asterisks[i]; j < c; j++) {
				mat[i][j] = in[ind++];
			}
			System.out.println(mat[i]);
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
		new personalized_cup().run();
	}
}