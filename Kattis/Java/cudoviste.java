
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class cudoviste {
	
	public static final char BUILDING = '#';
	public static final char CAR = 'X';
	public static final char EMPTY = '.';
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer rowColumn = new StringTokenizer(file.readLine());
		int r = Integer.parseInt(rowColumn.nextToken());
		int c = Integer.parseInt(rowColumn.nextToken());
		char[][] mat = new char[r][c];
		for (int i = 0; i < r; i++) {
			mat[i] = file.readLine().toCharArray();
		}
		int[] carsCrushed = new int[5];
		
		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < c - 1; j++) {
				char[] carParking = {mat[i][j], mat[i+1][j], mat[i+1][j+1], mat[i][j+1]};
				//System.out.println(Arrays.toString(carParking));
				int carAmount = 0;
				boolean works = true;
				for (int x = 0; x < carParking.length; x++) {
					if (carParking[x] == BUILDING) {
						works = false;
						break;
					}
					if (carParking[x] == CAR) carAmount++;
				}
				if (works) {
					carsCrushed[carAmount]++;
				}
			}
		}
		for (int i : carsCrushed) System.out.println(i);
	}
}
