import java.util.*;
import java.io.*;

public class kitchen_utensils {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int n = file.nextInt();
		int k = file.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int a = file.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			}
			else {
				map.put(a, 1);
			}
		}
		int t = 1;
		for (int a : map.keySet()) {
			t = Math.max(t, (int) Math.ceil((double)map.get(a)/k));
		}
		t = t * k * map.keySet().size();
		int ans = t - n;
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
		new kitchen_utensils().run();
	}
}