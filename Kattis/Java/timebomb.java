
import java.util.*;
import java.io.*;

class timebomb {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		char[][] mat = null;
		for (int i = 0; i < 5; i++) {
			String input = file.readLine();
			if (i == 0) {
				mat = new char[5][input.length()];
			}
			mat[i] = input.toCharArray();
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>() {{
			put("**** ** ** ****", 0);
			put("  *  *  *  *  *", 1);
			put("***  *****  ***", 2);
			put("***  ****  ****", 3);
			put("* ** ****  *  *", 4);
			put("****  ***  ****", 5);
			put("****  **** ****", 6);
			put("***  *  *  *  *", 7);
			put("**** ***** ****", 8);
			put("**** ****  ****", 9);
			put("***** ****  ***", 9);
		}};
		String[] res = new String[(mat[0].length + 1) / 4];
		int place = 0;
		for (int i = 0; i < res.length; i++) {
			String cur = "";
			for (int j = 0; j < 5; j++) {
				for (int x = place; x < place + 3; x++) {
					cur += mat[j][x];
				}
			}
			res[i] = cur;
			place += 4;
		}
		place = 1;
		int finalAnswer = 0;
		for (int i = res.length - 1; i >= 0; i--, place *= 10) {
			if (map.containsKey(res[i]))
			finalAnswer += map.get(res[i]) * place;
		}
		System.out.println(finalAnswer % 6 == 0 ? "BEER!!" : "BOOM!!");
	}
}
