
import java.util.*;
import java.io.*;

class different {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			Scanner s = new Scanner(line);
			long a = s.nextLong();
			long b = s.nextLong();
			if (a > b) {
				System.out.println(a - b);
			}
			else {
				System.out.println(b - a);
			}
		}
	}
}
