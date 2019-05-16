import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class nicegarland {

	public static void main(String[] args) throws Exception {
		new nicegarland().run();
	}

	public void run() throws Exception {
		FastIO file = new FastIO();
		int n = file.nextInt();
		char[] c = file.nextLine().trim().toCharArray();
		int a = 0;
		//RGBRGBRGB... or RBG etc. etc.
		if (c.length == 2) {
			if (c[0] == c[1]) {
				if (c[0] == 'R') {
					c[0] = 'G';
				}
				else {
					c[0] = 'R';
				}
			}
		}
		else {
			int[][] b = new int[3][3];
			for (int i = 0; i < c.length; i++) {
				if (c[i] == 'R') {
					b[0][i%3]++;
				}
				else if (c[i] == 'G') {
					b[1][i%3]++;
				}
				else {
					b[2][i%3]++;
				}
			}
			int R;
			int G;
			int B;
			char[] d = {'R', 'G', 'B'};
			if (b[0][0] + b[0][1]+ b[0][2] > b[1][0] + b[1][1] + b[1][2] && b[0][0] + b[0][1]+ b[0][2] > b[2][0] + b[2][1] + b[2][2]) {
				R = b[0][0] >= b[0][1] && b[0][0] >= b[0][2] ? 0 : b[0][1] >= b[0][0] && b[0][1] >= b[0][2] ? 1 : 2;
				G = b[1][0] > b[1][1] && b[1][0] > b[1][2] ? 0 : b[1][1] >= b[1][0] && b[1][1] >= b[1][2] ? 1 : 2;
				B = b[2][0] > b[2][1] && b[2][0] > b[2][2] ? 0 : b[2][1] > b[2][0] && b[2][1] > b[2][2] ? 1 : 2;
			}
			else if (b[0][0] + b[0][1]+ b[0][2] <= b[1][0] + b[1][1] + b[1][2] && b[1][0] + b[1][1]+ b[1][2] > b[2][0] + b[2][1] + b[2][2]) {
				G = b[1][0] >= b[1][1] && b[1][0] >= b[1][2] ? 0 : b[1][1] >= b[1][0] && b[1][1] >= b[1][2] ? 1 : 2;
				R = b[0][0] > b[0][1] && b[0][0] > b[0][2] ? 0 : b[0][1] >= b[0][0] && b[0][1] >= b[0][2] ? 1 : 2;
				B = b[2][0] > b[2][1] && b[2][0] > b[2][2] ? 0 : b[2][1] > b[2][0] && b[2][1] > b[2][2] ? 1 : 2;
			}
			else {
				B = b[2][0] >= b[2][1] && b[2][0] >= b[2][2] ? 0 : b[2][1] >= b[2][0] && b[2][1] >= b[2][2] ? 1 : 2;
				G = b[1][0] > b[1][1] && b[1][0] > b[1][2] ? 0 : b[1][1] >= b[1][0] && b[1][1] >= b[1][2] ? 1 : 2;
				R = b[0][0] >= b[0][1] && b[0][0] >= b[0][2] ? 0 : b[0][1] > b[0][0] && b[0][1] > b[0][2] ? 1 : 2;
			}
			System.out.println(R + " " + G + " " + B);
			for (int i = 0; i < c.length; i+=3) {
				switch(c[i]) {
				case 'R':
					if (c[i%3]!=d[R]) {
						a++;
						System.out.println(i + " " + c[i] + " R");
						c[i] = 'R';
					}
					break;
				case 'G':
					if (c[i%3]!=d[G]) {
						a++;
						System.out.println(i + " " + c[i] + " G");
						c[i] = 'G';
					}
					break;
				case 'B':
					if (c[i%3]!=d[B]) {
						a++;
						System.out.println(i + " " + c[i] + " B");
						c[i] = 'B';
					}
					break;
				}
				if(i<c.length-1)
				switch(c[i+1]) {
				case 'R':
					if (c[(i+1)%3]!=d[R]) {
						a++;
						System.out.println(i+1 + " " + c[i+1] + " R");
						c[i+1] = 'R';
					}
					break;
				case 'G':
					if (c[(i+1)%3]!=d[G]) {
						a++;
						System.out.println(i+1 + " " + c[i+1] + " G");
						c[i+1] = 'G';
					}
					break;
				case 'B':
					if (c[(i+1)%3]!=d[B]) {
						a++;
						System.out.println(i+1 + " " + c[i+1] + " B");
						c[i+1] = 'B';
					}
					break;
				}
				if(i<c.length-2)
				switch(c[i+2]) {
				case 'R':
					if (c[(i+2)%3]!=d[R]) {
						a++;
						System.out.println(i+2 + " " + c[i+2] + " R");
						c[i+2] = 'R';
					}
					break;
				case 'G':
					if (c[(i+2)%3]!=d[G]) {
						a++;
						System.out.println(i+2 + " " + c[i+2] + " G");
						c[i+2] = 'G';
					}
					break;
				case 'B':
					if (c[(i+2)%3]!=d[B]) {
						a++;
						System.out.println(i+2 + " " + c[i+2] + " B");
						c[i+2] = 'B';
					}
					break;
				}
			}
			System.out.println(a);
			System.out.println(c);
		}
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
