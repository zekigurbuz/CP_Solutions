
import java.io.*;
import java.util.*;

class skener {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int r = file.nextInt();
		int c = file.nextInt();
		int zr = file.nextInt();
		int zc = file.nextInt();
		file.nextLine();
		char[][] mat = new char[r][c];
		for (int i = 0; i < r; i++) {
			mat[i] = file.nextLine().toCharArray();
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < zr; j++) {
				for (int x = 0; x < c; x++) {
					for (int g = 0; g < zc; g++) {
						System.out.print(mat[i][x]);
					}
				}
				System.out.println();
			}
		}
	}
}
