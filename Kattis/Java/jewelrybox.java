
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;

class jewelrybox {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		for (int asdf = 0; asdf < times; asdf++) {
			int[] ab = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
			System.out.println(box(ab[0],ab[1]));
		}
	}

	static double box(int x, int y) {

		double h1 = (y + x - Math.sqrt(y * y - x * y + x * x)) / 6.0;
		double h2 = (y + x + Math.sqrt(y * y - x * y + x * x)) / 6.0;

		if (h1 < 0)
			return 2 * (y - 2 * h2) * (x - 2 * h2);
		else if (h2 < 0)
			return h1 * (y - 2 * h1) * (x - 2 * h1);
		else
			return Math.max(h1 * (y - 2 * h1) * (x - 2 * h1), 2 * (y - 2 * h2) * (x - 2 * h2));
	}
}
