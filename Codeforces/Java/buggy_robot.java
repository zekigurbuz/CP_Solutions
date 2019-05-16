import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class buggy_robot {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		char[] c = file.nextLine().trim().toCharArray();
		int l = 0;
		int r = 0;
		int u = 0;
		int d = 0;
		for (int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case 'L':
				l++;
				break;
			case 'R':
				r++;
				break;
			case 'U':
				u++;
				break;
			case 'D':
				d++;
				break;
			}
		}
		int ans = Math.min(l, r)*2 + Math.min(u, d)*2;
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
		new buggy_robot().run();
	}
}