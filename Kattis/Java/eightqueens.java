
import java.util.*;
import java.io.*;

class eightqueens {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		char[][] mat = new char[8][8];
		int qCount = 0;
		for (int i = 0; i < 8; i++) {
			char[] line = file.readLine().toCharArray();
			for (char c : line) if (c == '*') qCount++;
			mat[i] = line;
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (mat[i][j] == '*') {
					int iR;
					int jR;
					iR = i + 1;
					jR = j;
					while (iR < 8) {
						mat[iR++][jR] = '.';
					}
					iR = i - 1;
					while (iR >= 0) {
						mat[iR--][jR] = '.';
					}
					iR = i;
					jR = j + 1;
					while (jR < 8) {
						mat[iR][jR++] = '.';
					}
					jR = j - 1;
					while (jR >= 0) {
						mat[iR][jR--] = '.';
					}
					iR = i + 1;
					jR = j + 1;
					while (iR < 8 && jR < 8) {
						mat[iR++][jR++] = '.';
					}
					iR = i - 1;
					jR = j - 1;
					while (iR >= 0 && jR >= 0) {
						mat[iR--][jR--] = '.';
					}
					iR = i + 1;
					jR = j - 1;
					while (iR < 8 && jR >= 0) {
						mat[iR++][jR--] = '.';
					}
					iR = i - 1;
					jR = j + 1;
					while (iR >= 0 && jR < 8) {
						mat[iR--][jR++] = '.';
					}
				}
			}
		}
		int newCount = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (mat[i][j] == '*') newCount++;
			}
		}
		if (newCount != 8 || qCount != 8) {
			System.out.println("invalid");
		}
		else {
			System.out.println("valid");
		}
	}
}
