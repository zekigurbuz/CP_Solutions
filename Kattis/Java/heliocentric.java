
import java.util.*;
import java.io.*;

class heliocentric {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer reader;
		int x = 1;
		while ((line = file.readLine()) != null) {
			reader = new StringTokenizer(line);
			int a = Integer.parseInt(reader.nextToken());
			int b = Integer.parseInt(reader.nextToken());
			int count = 0;
			while(a != 0 || b != 0) {
				a++;
				b++;
				a %= 365;
				b %= 687;
				count++;
			}
			System.out.println("Case " + (x++) + ": " + count);
		}
	}
}
