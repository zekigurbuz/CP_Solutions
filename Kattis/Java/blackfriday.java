
import java.util.*;
import java.io.*;

class blackfriday {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int highest = 0;
		int index = -1;
		int numPep = Integer.parseInt(file.readLine());
		StringTokenizer reader = new StringTokenizer(file.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		while (numPep-->0) {
			arr.add(Integer.parseInt(reader.nextToken()));
		}
		for (int i = 0; i < arr.size(); i++) {
			if (Collections.frequency(arr, arr.get(i)) == 1 && arr.get(i) > highest) {
				highest = arr.get(i);
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("none");
		}
		else {
			System.out.println(index + 1);
		}
	}
}
