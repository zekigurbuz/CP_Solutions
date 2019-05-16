
import java.util.*;
import java.io.*;

class fallingapart {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		file.readLine();
		int aScore = 0;
		int bScore = 0;
		int[] arr = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		Arrays.sort(arr);
		boolean turn = true;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (turn) {
				aScore += arr[i];
				turn = false;
			}
			else {
				bScore += arr[i];
				turn = true;
			}
		}
		System.out.println(aScore + " " + bScore);
	}
}
