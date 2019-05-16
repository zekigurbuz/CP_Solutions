
import java.util.*;
import java.io.*;

class egypt {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			StringTokenizer reader = new StringTokenizer(line);
			if (line.equals("0 0 0")) break;
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(reader.nextToken());
			Arrays.sort(arr);
			if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}
}
