import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class inna_and_choose_options {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		while (n-->0) {
			char[] c = file.nextLine().trim().toCharArray();
			int[] a = {12,6,4,3,2,1};
			int co = 0;
			List<String> s = new LinkedList<>();
			for (int i = 0; i < 6; i++) {
				int aa = a[i];
				boolean f = false;
				for (int x = 0; x < 12/(12/aa) && !f; x++) {
					boolean w = true;
					for (int j = x; j < 12 && !f; j += aa) {
						if (c[j] != 'X') {
							w = false; break;
						}
					}
					if (w) {f = true; co++; s.add(12/aa+"x"+aa);}
				}
			}
			System.out.println(co + " " + s.toString().replaceAll("[\\[\\],]", ""));
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
		new inna_and_choose_options().run();
	}
}