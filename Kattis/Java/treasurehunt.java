import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class treasurehunt {

	static char[][] mat;
	static boolean[][] visited;
	static boolean done;
		
	public static void main(String[] args) throws Exception {
		new treasurehunt().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer (file.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		mat = new char[r][c];
		visited = new boolean[r][c];
		for (int i = 0; i < r; i++) {
			mat[i] = file.readLine().toCharArray();
		}
		recur(0,0,0);
	}
	public static void recur(int x, int y, int steps) {
		if (done) return;
		if (x < 0 || x >= mat.length || y < 0 || y >= mat[x].length) {
			System.out.println("Out"); done = true; return;
		}
		if (mat[x][y] == 'T') {
			System.out.println(steps); done = true; return;
		}
		if (visited[x][y]) {
			System.out.println("Lost"); done = true; return;
		}
		visited[x][y] = true;
		switch (mat[x][y]) {
		case 'N':
			recur(x-1,y,steps+1);
			break;
		case 'S':
			recur(x+1, y, steps + 1);
			break;
		case 'E':
			recur(x, y + 1, steps + 1);
		case 'W':
			recur(x, y - 1, steps + 1);
			break;
			default: break;
		}
		return;
	}
}