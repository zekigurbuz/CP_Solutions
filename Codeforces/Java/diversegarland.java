import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class diversegarland {

	public static void main(String[] args) throws Exception {
		new diversegarland().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		char[] c = file.next().toCharArray();
		int a = 0;
		for (int i = 0; i < n; i++) {
			if (i > 0 && i < n - 1){
				if (c[i] == c[i-1]) {
					a++;
					if (c[i-1] == c[i+1]) {
						if (c[i-1] == 'G') {
							c[i] = 'R';
						}
						else if (c[i-1] == 'R') {
							c[i] = 'B';
						}
						else {
							c[i] = 'G';
						}
					}
					else {
						if (c[i-1] == 'R' && c[i+1] == 'G') {
							c[i] = 'B';
						}
						else if (c[i-1] == 'R' && c[i+1] == 'B') {
							c[i] = 'G';
						}
						else if (c[i-1] == 'G' && c[i+1] == 'R') {
							c[i] = 'B';
						}
						else if (c[i-1] == 'G' && c[i+1] == 'B') {
							c[i] = 'R';
						}
						else if (c[i-1] == 'B' && c[i+1] == 'R') {
							c[i] = 'G';
						}
						else {
							c[i] = 'R';
						}
					}
				}
			}
		}
		if (n > 1 && c[0] == c[1]) {
			if (c[1] == 'R') {
				c[0] = 'G';
			}
			else if (c[1] == 'G') {
				c[0] = 'B';
			}
			else {
				c[0] = 'R';
			}
			a++;
		}
		else if (n > 1 && c[n-1] == c[n-2]) {
			if (c[n-2] == 'R') {
				c[n-1] = 'G';
			}
			else if (c[n-2] == 'G') {
				c[n-1] = 'B';
			}
			else {
				c[n-1] = 'R';
			}
			a++;
		}
		System.out.println(a);
		System.out.println(c);
	}

	public static class FastIO {
		BufferedReader br;
		StringTokenizer st;

		public FastIO() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static long pow(long n, long p, long mod) {
		if (p == 0)
			return 1;
		if (p == 1)
			return n % mod;
		if (p % 2 == 0) {
			long temp = pow(n, p / 2, mod);
			return (temp * temp) % mod;
		} else {
			long temp = pow(n, p / 2, mod);
			temp = (temp * temp) % mod;
			return (temp * n) % mod;

		}
	}

	public static long pow(long n, long p) {
		if (p == 0)
			return 1;
		if (p == 1)
			return n;
		if (p % 2 == 0) {
			long temp = pow(n, p / 2);
			return (temp * temp);
		} else {
			long temp = pow(n, p / 2);
			temp = (temp * temp);
			return (temp * n);

		}
	}

	public static long gcd(long x, long y) {
		if (x == 0)
			return y;
		else
			return gcd(y % x, x);
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}
}
