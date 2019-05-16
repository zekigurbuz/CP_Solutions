
import java.util.*;
import java.io.*;

class password {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		double res = 0;
		double[] dubs = new double[n];
		for (int i = 1; i <= n; i++) {
			StringTokenizer read = new StringTokenizer(file.readLine());
			read.nextToken();
			dubs[i - 1] = Double.parseDouble(read.nextToken());
		}
		Arrays.sort(dubs);
		for (int i = n; i >= 1; i--) {
			res+= dubs[i-1] * (n - i + 1);
		}
		System.out.printf("%.4f", res);
	}
}
