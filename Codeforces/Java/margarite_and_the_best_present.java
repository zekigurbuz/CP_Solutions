import java.util.*;
import java.io.*;

public class margarite_and_the_best_present {
	public void run() throws Exception {
		FastScanner file = new FastScanner();
		int q = file.nextInt();
		while (q-->0) {
			long l = file.nextLong();
			long r = file.nextLong();
			long ans=0;
			if (l%2==0) 
			{
				ans+=l;
				l++;
			}
			if (r%2==1)
			{
				ans-=r;
				r--;
			}
			ans+=(r-l+1)/2;
			System.out.println(ans);
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
		new margarite_and_the_best_present().run();
	}
}