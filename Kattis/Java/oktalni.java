
import java.util.*;
import java.io.*;

class oktalni {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String input = file.readLine();
		while (input.length() % 3 != 0) {
			input = "0" + input;
		}
		HashMap<String, Character> map = new HashMap<String, Character>() {{
			put("000", '0');
			put("001", '1');
			put("010", '2');
			put("011", '3');
			put("100", '4');
			put("101", '5');
			put("110", '6');
			put("111", '7');
		}};
		String res = "";
		for (int i = 0; i < input.length(); i+= 3) {
			String current = input.substring(i, i + 3);
			res += map.get(current);
		}
		System.out.println(res);
	}
}
