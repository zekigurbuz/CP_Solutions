
import java.util.*;
import java.io.*;

class golombrulers {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			int[] arr = Arrays.stream(line.split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
			ArrayList<Integer> nums = new ArrayList<>();
			boolean ruler = true;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					int measure = Math.abs(arr[i] - arr[j]);
					if (nums.contains(measure)) {
						ruler = false;
					}
					else {
						nums.add(measure);
					}
				}
			}
			ArrayList<Integer> all = new ArrayList<>();
			for (int i = 1; i <= Arrays.stream(arr).max().getAsInt(); i++) all.add(i);
			all.removeAll(nums);
			if (ruler) {
				if (all.size() == 0) {
					System.out.println("perfect");
				}
				else {
					System.out.println("missing" + all.toString().replaceAll("[\\[\\] ,]+", " "));
				}
			}
			else {
				System.out.println("not a ruler");
			}
		}
	}
}
