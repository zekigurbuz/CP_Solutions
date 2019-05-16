
import java.util.*;
import java.io.*;

class closingtheloop {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		for (int asdf = 1; asdf <= times; asdf++) {
			int numStrings = Integer.parseInt(file.readLine());
			ArrayList<Str> blueStrings = new ArrayList<>();
			ArrayList<Str> redStrings = new ArrayList<>();
			StringTokenizer strReader = new StringTokenizer(file.readLine());
			for (int i = 0; i < numStrings; i++) {
				String s = strReader.nextToken();
				char color = s.charAt(s.length() - 1);
				int length = Integer.parseInt(s.substring(0,s.length() - 1));
				if (color == 'R') {
					redStrings.add(new Str(color, length));
				}
				else {
					blueStrings.add(new Str(color, length));
				}
			}
			Collections.sort(blueStrings);
			Collections.sort(redStrings);
			int res = 0;
			if (blueStrings.size() == 0 || redStrings.size() == 0) {
				res = 0;
			}
			else {
//				if (blueStrings.size() == redStrings.size()) {
//					if (blueStrings.get(blueStrings.size() - 1).len > redStrings.get(redStrings.size() - 1).len) {
//						redStrings.remove(redStrings.size() - 1);
//					}
//					else {
//						blueStrings.remove(blueStrings.size() - 1);
//					}
//				}
				while(redStrings.size() > blueStrings.size()) {
					redStrings.remove(redStrings.size() - 1);
				}
				while(blueStrings.size() > redStrings.size()) {
					blueStrings.remove(blueStrings.size() - 1);
				}
				for (int i = 0; i < blueStrings.size(); i++) {
					res += blueStrings.get(i).len;
				}
				for (int i = 0; i < redStrings.size(); i++) {
					res += redStrings.get(i).len;
				}
			}
			if (res > 0) {
				res -= blueStrings.size() + redStrings.size();
			}
			System.out.printf("Case #%d: %d%n", asdf, res);
		}
	}
	public static class Str implements Comparable<Str> {
		char color;
		int len;
		public Str(char color, int len) {
			this.color = color;
			this.len = len;
		}
		public int compareTo(Str other) {
			if (this.len > other.len) return -1;
			if (this.len < other.len) return 1;
			return 0;
		}
	}
}
