
import java.util.*;
import java.io.*;

class cetiri {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		Arrays.sort(arr);
		if (arr[2] - arr[1] == arr[1] - arr[0]) {
			System.out.println(arr[2] + (int) Math.abs(arr[2] - arr[1]));
		}
		else if (arr[2] - arr[1] > arr[1] - arr[0]) {
			System.out.println(arr[1] + (int) Math.abs(arr[1] - arr[0]));
		}
		else {
			System.out.println(arr[0] + (int) Math.abs(arr[2] - arr[1]));
		}
	}
}
