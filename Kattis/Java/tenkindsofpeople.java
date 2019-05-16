
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class tenkindsofpeople {
	
	public static char[][] mat;
	public static char[][] matCopy;
	public static boolean works;
	
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  StringTokenizer reader = new StringTokenizer(file.readLine());
	  int r = Integer.parseInt(reader.nextToken());
	  int c = Integer.parseInt(reader.nextToken());
	  mat = new char[r][c];
	  matCopy = new char[r][c];
	  for (int i = 0; i < r; i++) {
		  char[] line = file.readLine().toCharArray();
		  mat[i] = line;
		  matCopy[i] = line;
	  }
	  int n = Integer.parseInt(file.readLine());
	  for (int i = 0; i < n; i++) {
		 // System.out.println(Arrays.deepToString(mat));
		  reader = new StringTokenizer(file.readLine());
		  int r1 = Integer.parseInt(reader.nextToken()) - 1;
		  int c1 = Integer.parseInt(reader.nextToken()) - 1;
		  int r2 = Integer.parseInt(reader.nextToken()) - 1;
		  int c2 = Integer.parseInt(reader.nextToken()) - 1;
		  
		  works = false;
		  copy();
		  recur(r1,c1,r2,c2,'1');
		  copy();
		  if (!works)
		  recur(r1,c1,r2,c2,'0');
		  if (!works) System.out.println("neither");
	  }
  }
  public static void copy() {
	  mat = new char[matCopy.length][matCopy[0].length];
	  for (int i = 0; i < mat.length; i++) {
		  for (int j = 0; j < mat[i].length; j++) {
			  mat[i][j] = matCopy[i][j];
		  }
	  }
  }
  public static void recur(int x, int y, int targetX, int targetY, char val) {
	  if (x < 0 || x >= mat.length || y < 0 || y >= mat[x].length || mat[x][y] == (val == '1' ? '0' : '1')) return;
	  if (x == targetX && y == targetY)  {
		  works = true;
		  System.out.println(val == '0' ? "binary" : "decimal");
	  }
	  mat[x][y] = val == '1' ? '0' : '1';
	  recur(x+1,y,targetX,targetY,val);
	  recur(x-1,y,targetX,targetY,val);
	  recur(x,y+1,targetX,targetY,val);
	  recur(x,y-1,targetX,targetY,val);
  }
}
