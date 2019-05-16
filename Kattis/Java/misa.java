
import java.util.*;
import java.io.*;

class misa {
	static char [][] mat;
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		int r = Integer.parseInt(reader.nextToken());
		int c = Integer.parseInt(reader.nextToken());
		mat = new char[r][c];
		for (int i = 0; i < r; i++) {
			mat[i] = file.readLine().toCharArray();
		}
		int bR = -1;
		int bC = -1;
		int highest = Integer.MIN_VALUE;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (mat[i][j] == '.') {
					int count = 0;
					if (i < r - 1 && mat[i+1][j] == 'o') count++;
					if (i < r - 1 && j < c - 1 && mat[i+1][j+1] == 'o') count++;
					if (i > 0 && mat[i-1][j] == 'o') count++;
					if (i > 0 && j > 0 && mat[i-1][j - 1] == 'o') count++;
					if (j < c - 1 && mat[i][j+1] == 'o') count++;
					if (i < r - 1 && j > 0 && mat[i+1][j-1] == 'o') count++;
					if (i > 0 && j < c - 1 && mat[i-1][j+1] == 'o') count++;
					if (j > 0 && mat[i][j-1] == 'o') count++;
					if (count > highest) {
						highest = count;
						bC = j;
						bR = i;
					}
				}
			}
		}
		if (bR >= 0 || bC >= 0) {
			mat[bR][bC] = 'o';
		}
		int res = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (mat[i][j] == 'o') {
					if (j < c - 1 && mat[i][j+1] == 'o') res++;
					if (i < r - 1 && j > 0 && mat[i+1][j-1] == 'o') res++;
					if (i < r - 1 && mat[i+1][j] == 'o') res++;
					if (i < r - 1 && j < c - 1 && mat[i+1][j+1] == 'o') res++;
				}
			}
		}
		System.out.println(res);
	}
}
