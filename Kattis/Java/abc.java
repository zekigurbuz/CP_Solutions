
import java.util.*;
import java.io.*;

class abc {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int[] abc = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		char[] order = file.readLine().toCharArray();
		Arrays.sort(abc);
		for (int i = 0; i < 3; i++) {
			System.out.print(abc[order[i] - 'A'] + " ");
		}
	}
}
