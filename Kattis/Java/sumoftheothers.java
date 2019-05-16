
import java.util.*;
import java.io.*;

class sumoftheothers {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			int[] arr = Arrays.stream(line.split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
			for (int i = 0; i < arr.length; i++) {
				int cur = arr[i];
				int sum = 0;
				for (int j = 0; j < arr.length; j++) {
					if (j != i)
						sum += arr[j];
				}
				if (sum == cur) {
					System.out.println(cur);
					break;
				}
			}
		}
	}
}
