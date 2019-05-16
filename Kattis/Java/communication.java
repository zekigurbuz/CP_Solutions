
import java.util.*;
import java.io.*;

class communication {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		file.readLine();
		int[] arr = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		for (int i : arr) {
			int res = 0;
			for (int j = 0; j < 8; j++) {
				res |= (int) Math.pow(((i ^ res) & 2), j) * j;
			}
			System.out.println(res);
		}

	}
}
