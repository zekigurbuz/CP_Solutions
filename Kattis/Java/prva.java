
import java.util.*;
import java.io.*;

class prva {

	static char[][] mat;
	static int r;
	static int c;
	static TreeSet<String> words;

	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer lineReader = new StringTokenizer(file.readLine());
		r = Integer.parseInt(lineReader.nextToken());
		c = Integer.parseInt(lineReader.nextToken());
		mat = new char[r][c];
		for (int i = 0; i < r; i++) {
			mat[i] = file.readLine().toCharArray();
		}
		words = new TreeSet<>();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i == 0) {
					recurDown(0,j,"");
				}
				if (j == 0) {
					recurRight(i,0,"");
				}
				if (mat[i][j] == '#') {
					recurDown(i+1,j,"");
					recurRight(i,j+1,"");
				}
			}
		}
		System.out.println(words.pollFirst());
	}

	public static void recurDown(int x, int y, String word) {
		if (x < 0 || x >= r || y < 0 || y >= c || mat[x][y] == '#') {
			if (word.length() >= 2) {
				words.add(word);
			}
			return;
		}
		recurDown(x+1, y, word + mat[x][y]);
	}

	public static void recurRight(int x, int y, String word) {
		if (x < 0 || x >= r || y < 0 || y >= c || mat[x][y] == '#') {
			if (word.length() >= 2) {
				words.add(word);
			}
			return;
		}
		recurRight(x, y+1, word + mat[x][y]);
	}
}
