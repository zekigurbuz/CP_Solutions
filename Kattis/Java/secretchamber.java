
import java.util.*;
import java.io.*;

class secretchamber {

	static HashMap<Character, ArrayList<Character>> map;
	static char[] one;
	static char[] two;
	static boolean works;
		
	@SuppressWarnings("serial")
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		map = new HashMap<Character, ArrayList<Character>>();
		StringTokenizer reader = new StringTokenizer(file.readLine());
		int n1 = Integer.parseInt(reader.nextToken());
		int n2 = Integer.parseInt(reader.nextToken());
		for (int i = 0; i < n1; i++) {
			reader = new StringTokenizer(file.readLine());
			char a = reader.nextToken().charAt(0);
			char b = reader.nextToken().charAt(0);
			if (map.containsKey(a)) {
				map.get(a).add(b);
			} else {
				map.put(a, new ArrayList<Character>() {
					{
						add(b);
					}
				});
			}
		}
		for (int i = 0; i < n2; i++) {
			reader = new StringTokenizer(file.readLine());
			one = reader.nextToken().toCharArray();
			two = reader.nextToken().toCharArray();
			works = false;
			if (one.length == two.length)
				recur(one, two, 0);
			else {
				works = false;
			}
			System.out.println(works ? "yes" : "no");
		}
		file.close();
	}

	public static void recur(char[] one, char[] two, int index) {
		if (index == one.length) {
			works = true;
			return;
		}
		char current = one[index];
		if (one[index] == two[index]) {
			recur(one, two, index + 1);
		} else {
			for (char c : map.keySet()) {
				if (current == c) {
					for (char b : map.get(c)) {
						one[index] = b;
						recur(one, two, index);
					}
				}
			}
		}
	}
}
