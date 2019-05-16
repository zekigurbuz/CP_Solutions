
import java.util.*;
import java.io.*;

class marko {
	
	static int count;
	static HashMap<Integer, String> map;
	static int[] code;
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int nw = Integer.parseInt(file.readLine());
		char[][] words = new char[nw][];
		for (int i = 0; i < nw; i++) {
			words[i] = file.readLine().toCharArray();
		}
		code = Arrays.stream(file.readLine().split("")).mapToInt(n -> Integer.parseInt(n)).toArray();
		count = 0;
		map = new HashMap<Integer, String>();
		map.put(1, "");
		map.put(0, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		for (char[] s : words) {
			recur(s, 0);
		}
		System.out.println(count);
	}
	public static void recur(char[] s, int index) {
		if (s.length!=code.length) return;
		if (index == s.length) {
			count++; return;
		}
		if (map.get(code[index]).contains(s[index] + "")) {
			recur(s, index + 1);
		}
		return;
	}
}
