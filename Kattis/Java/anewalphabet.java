
import java.util.*;
import java.io.*;

class anewalphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, String> map = new HashMap<Character, String>() {{
			put('a', "@");
			put('b', "8");
			put('c', "(");
			put('d', "|)");
			put('e', "3");
			put('f', "#");
			put('g', "6");
			put('h', "[-]");
			put('i', "|");
			put('j', "_|");
			put('k', "|<");
			put('l', "1");
			put('m', "[]\\/[]");
			put('n', "[]\\[]");
			put('o', "0");
			put('p', "|D");
			put('q', "(,)");
			put('r', "|Z");
			put('s', "$");
			put('t', "']['");
			put('u', "|_|");
			put('v', "\\/");
			put('w', "\\/\\/");
			put('x', "}{");
			put('y', "`/");
			put('z', "2");
			put(' ', " ");
		}};
		String res = "";
		char[] input = file.readLine().toLowerCase().toCharArray();
		for (int i = 0; i < input.length; i++) {
			if (map.containsKey(input[i]))
				res += map.get(input[i]);
			else
				res += input[i];
		}
		System.out.println(res);
	}
}
