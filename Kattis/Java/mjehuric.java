
import java.util.*;
import java.io.*;

class mjehuric {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		while (true) {
			if (arr[0] > arr[1]) {
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				printArr(arr);
			}
			if (arr[1] > arr[2]) {
				int temp = arr[1];
				arr[1] = arr[2];
				arr[2] = temp;
				printArr(arr);
			}
			if (arr[2] > arr[3]) {
				int temp = arr[2];
				arr[2] = arr[3];
				arr[3] = temp;
				printArr(arr);
			}
			if (arr[3] > arr[4]) {
				int temp = arr[3];
				arr[3] = arr[4];
				arr[4] = temp;
				printArr(arr);
			}
			boolean done = true;
			for (int i = 1; i < 5; i++) {
				if (arr[i-1] != i) {
					done = false;
				}
			}
			if (done) break;
		}
	}
	public static void printArr(int[] arr) {
		String s = Arrays.toString(arr);
		s = s.replaceAll("[\\[\\], ]+", " ");
		System.out.println(s.trim());
	}
}
