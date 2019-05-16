
import java.util.*;
import java.io.*;

class statistics {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line; int counter = 1;
		while ((line = file.readLine()) != null) {
			int[] arr = Arrays.stream(line.substring(line.indexOf(" ") + 1).split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
			OptionalInt max = Arrays.stream(arr).max();
			OptionalInt min = Arrays.stream(arr).min();
			int range = max.getAsInt() - min.getAsInt();
			System.out.println("Case " + counter++ + ": " + min.getAsInt() + " " + max.getAsInt() + " " + range);
		}
	}
}
