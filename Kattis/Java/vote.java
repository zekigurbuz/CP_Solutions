
import java.util.*;
import java.io.*;

class vote {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			int n = Integer.parseInt(file.readLine());
			int[] arr = new int[n];
			double total = 0;
			while (n-->0) {
				int cur = Integer.parseInt(file.readLine());
				total += cur;
				arr[arr.length - n - 1] = cur;
			}
			boolean works = true;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] / total > .5) {
					works = false;
					System.out.println("majority winner " + (i + 1));
				}
			}
			if (works) {
				int maxWinners = 0;
				int index = 0;
				int max = Integer.parseInt(Arrays.stream(arr).max().toString().replaceAll("[^0-9]+", ""));
				for (int i = 0; i < arr.length; i++) if (arr[i] == max) {
					index = i;
					maxWinners++;
				}
				if (maxWinners == 1) {
					System.out.println("minority winner " + (index + 1));
				}
				else {
					System.out.println("no winner");
				}
			}
		}
	}
}
