
import java.util.*;
import java.io.*;

class amoebas {
	
	static char[][] mat;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		int r = Integer.parseInt(reader.nextToken());
		int c = Integer.parseInt(reader.nextToken());
		mat = new char[r][c];
		visited = new boolean[r][c];
		for (int i = 0; i < r; i++) {
			mat[i] = file.readLine().toCharArray();
		}
		int blobCount = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (mat[i][j] == '#' && visited[i][j] == false) {
					recur(i,j);
					blobCount++;
				}
			}
		}
		System.out.println(blobCount);
	}
	public static void recur(int x, int y) {
		if (x < 0 || x >= mat.length || y < 0 || y >= mat[x].length || mat[x][y] == '.' || visited[x][y] == true) 
			return;
		visited[x][y] = true;
		recur(x + 1, y);
		recur(x - 1, y);
		recur(x + 1, y + 1);
		recur(x + 1, y - 1);
		recur(x, y + 1);
		recur(x, y - 1);
		recur(x - 1, y + 1);
		recur(x - 1, y - 1);
	}
}
