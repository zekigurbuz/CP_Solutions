
import java.util.*;
import java.io.*;

class plantingtrees {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		file.readLine();
		int[] trees = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		Arrays.sort(trees);
		int trash = trees.length;
		int max = 0;
		for (int i = 0; i < trees.length; i++, trash--) {
			trees[i] += trash;
			max = Math.max(trees[i], max);
		}
		System.out.println(max+1);
	}
}
