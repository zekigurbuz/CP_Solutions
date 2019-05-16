
import java.util.*;
import java.io.*;

class register {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		int[] cap = {2,3,5,7,11,13,17,19};
		int a = 0;
		while (arr[7] < 19) {
			arr[0]++;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == cap[i]) {
					arr[i] = 0;
					arr[i+1]++;
				}
			}
			a++;
		}
		if (a == 0) System.out.println(0);
		else {
			System.out.println(a - 1);
		}
	}
}
