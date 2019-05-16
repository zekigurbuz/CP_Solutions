
import java.util.*;
import java.io.*;

class greedilyincreasing {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		file.readLine();
		int[] arr = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		ArrayList<Integer> res = new ArrayList<>();
		res.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > res.get(res.size() - 1)) {
				res.add(arr[i]);
			}
		}
		System.out.println(res.size());
		for (int i : res) System.out.print(i + " ");
	}
}
