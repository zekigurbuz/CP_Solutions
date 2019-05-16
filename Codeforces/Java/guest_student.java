import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class guest_student {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int asdf = file.nextInt();
		while (asdf-->0) {
			int k = file.nextInt();
			int[] a = new int[7];
			for (int i = 0; i < 7; i++) a[i] = file.nextInt();
			int[] c = new int[7];
			for (int i = 0; i < 7; i++) {
				for (int j = i; j < i + 7; j++) {
					c[i] += a[j%7];
				}
			}
			int[] rem = new int[7];
			int[] res = new int[7];
			int[] inds = new int[7];
			for (int i = 0; i < 7; i++) {
				res[i] = k/c[i] * 7;
				rem[i] = k%c[i];
				inds[i] = i;
			}
			for (int i = 0; i < 7; i++) {
				int ind = i;
				while (rem[i] > 0) {
					if (a[ind] == 1) rem[i]--;
					ind++;
					ind %= 7;
					res[i]++;
				}
				inds[i] = ind - 1;
			}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < 7; i++) {
				while (inds[i] >= 0 && a[inds[i]--] == 1) res[i]--;
				min = Math.min(min, res[i]);
				System.out.println(res[i]);
			}
			System.out.println(min);
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
		new guest_student().run();
	}
}