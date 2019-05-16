
import java.util.*;
import java.io.*;

class unlockpattern {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int[][] mat = new int[3][3];
		for (int i = 0; i < 3; i++) {
			mat[i] = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		}
		int cur = 1;
		double dist = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (mat[i][j] == 1) {
					x = i;
					y = j;
				}
			}
		}
		while (cur < 9) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (mat[i][j] == cur + 1) {
						dist += dist(x,y,i,j);
						x = i;
						y = j;
						cur++;
					}
				}
			}
		}
		System.out.println(dist);
	}
	public static double dist(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
