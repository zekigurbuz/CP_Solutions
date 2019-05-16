
import java.util.*;
import java.io.*;

class aboveaverage {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while(times-->0) {
			StringTokenizer reader = new StringTokenizer(file.readLine());
			double total = 0;
			double average;
			int n = Integer.parseInt(reader.nextToken());
			int[] students = new int[n];
			for (int i = 0; i < n; i++) {
				students[i] = Integer.parseInt(reader.nextToken());
				total += students[i];
			}
			average = total / n;
			double x = 0;
			for (int i : students) {
				if (i > average) x++;
			}
			System.out.printf("%.3f%s%n", x / n * 100, "%");
		}
	}
}
