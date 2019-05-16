
import java.util.*;
import java.io.*;

class secretmessage {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			String input = file.readLine();
			int sq = (int) (Math.ceil(Math.sqrt(input.length())) * Math.ceil(Math.sqrt(input.length()))) ;
			while(input.length() < sq) input += "*";
			int sqrt = (int) Math.sqrt(sq);
			char[][] mat = new char[sqrt][sqrt];
			for (int i = 0; i < sqrt; i++) {
				for (int j = 0; j < sqrt; j++) {
					mat[i][j] = input.charAt(i  * sqrt + j);
				}
			}
			String res = "";
			for (int i = sqrt - 1; i >=  0; i--) {
				for (int j = 0; j < sqrt; j++) {
					if (mat[j][i] != '*')
					res += mat[j][i];
				}
			}
			System.out.println(new StringBuilder(res).reverse().toString());
		}
	}
}
