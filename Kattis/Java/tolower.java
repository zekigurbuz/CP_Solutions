
import java.util.*;
import java.io.*;

class tolower {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer pt = new StringTokenizer(file.readLine());
		int p = Integer.parseInt(pt.nextToken());
		int t = Integer.parseInt(pt.nextToken());
		int aRight = 0;
		for (int i = 0; i < p; i++) {
			boolean allGood = true;
			for (int j = 0; j < t; j++) {
				String input = file.readLine();
				if (!input.matches(".[a-z]+")) allGood = false;
			}
			if (allGood) aRight++;
		}
		System.out.println(aRight);
	}
}
