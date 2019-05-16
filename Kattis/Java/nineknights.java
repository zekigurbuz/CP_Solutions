
import java.util.*;
import java.io.*;

class nineknights {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		char[][] mat = new char[5][5];
		int n = 0;
		for (int i = 0; i < 5; i++) {
			char[] temp = file.readLine().toCharArray();
			for (int j = 0; j < 5; j++) {
				if (temp[j] == 'k') n++;
			}
			mat[i] = temp;
		}
		boolean works = true;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (mat[i][j] == 'k') {
					int[] is = {i-2,i-2,i-1,i-1,i+1,i+1,i+2,i+2};
					int[] js = {j-1,j+1,j-2,j+2,j-2,j+2,j-1,j+1};
					for (int x = 0; x < 8; x++) {
						if (is[x] >= 0 && is[x] < 5 && js[x] >= 0 && js[x] < 5 && mat[is[x]][js[x]] == 'k') {
							works = false;
						}
					}
				}
			}
		}
		if (works && n == 9) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}	
}
