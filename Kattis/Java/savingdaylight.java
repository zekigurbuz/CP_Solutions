
import java.util.*;
import java.io.*;

class savingdaylight {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			StringTokenizer lineReader = new StringTokenizer(line);
			for (int i = 0; i < 3; i++) {
				System.out.print(lineReader.nextToken() + " ");
			}
			String rise = lineReader.nextToken();
			String set = lineReader.nextToken();
			int h1 = Integer.parseInt(rise.substring(0,rise.indexOf(":")));
			int h2 = Integer.parseInt(set.substring(0, set.indexOf(":")));
			int m1 = Integer.parseInt(rise.substring(rise.indexOf(":") + 1));
			int m2 = Integer.parseInt(set.substring(set.indexOf(":") + 1));
			int diff = (h2 - h1) * 60 + (m2 - m1);
			int hd = diff / 60;
			diff %= 60;
			System.out.println(hd + " hours " + diff + " minutes");
		}
	}
}
