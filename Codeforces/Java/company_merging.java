import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class company_merging {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		ArrayList<comp> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int m = file.nextInt();
			int mm = 0;
			for (int j = 0; j < m; j++) {
				mm = Math.max(mm, file.nextInt());
			}
			a.add(new comp(m,mm));
		}
		Collections.sort(a);
		long ans = 0L;
		while (a.size() > 1) {
			ans += (a.get(1).sa - a.get(0).sa) * a.get(0).nu;
			a.get(1).nu += a.remove(0).nu;
		}
		System.out.println(ans);
	}
	public class comp implements Comparable<comp> {
		int nu;
		int sa;
		public comp(int nu, int sa) {
			this.nu = nu;
			this.sa = sa;
		}
		public int compareTo(comp o) {
			return Integer.compare(sa, o.sa);
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
		new company_merging().run();
	}
}