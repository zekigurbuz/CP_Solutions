
import java.util.*;
import java.io.*;

class irepeatmyself {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			String line = file.readLine();
			for (int i = 1; i <= line.length(); i++) {
				String pattern = line.substring(0,i);
				while (pattern.length() < line.length()) {
					pattern = pattern + pattern;
				}
				if (pattern.substring(0,line.length()).equals(line)) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
