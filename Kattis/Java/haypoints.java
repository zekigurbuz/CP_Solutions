
import java.util.*;
import java.io.*;

class haypoints {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		int m = file.nextInt();
		file.nextLine();
		HashMap<String, Long> map = new HashMap<>();
		while (n-->0) {
			map.put(file.next(), file.nextLong());
			file.nextLine();
		}
		while (m-->0) {
			String line = "";
			long total = 0;
			while (true) {
				line = file.nextLine();
				if (line.equals(".")) break;
				StringTokenizer reader = new StringTokenizer(line);
				while (reader.hasMoreTokens()) {
					String s = reader.nextToken();
					if (map.containsKey(s)) {
						total += map.get(s);
					}
				}
			}
			System.out.println(total);
		}
	}
}
