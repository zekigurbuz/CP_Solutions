
import java.util.*;
import java.io.*;

class leftbeehind {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			StringTokenizer reader = new StringTokenizer(line);
			int sweet = Integer.parseInt(reader.nextToken());
			int sour = Integer.parseInt(reader.nextToken());
			if (sweet == 0 && sour == 0) break;
			if (sweet + sour == 13) {
				System.out.println("Never speak again.");
			}
			else if (sweet == sour) {
				System.out.println("Undecided.");
			}
			else if (sour > sweet) {
				System.out.println("Left beehind.");
			}
			else {
				System.out.println("To the convention.");
			}
		}
	}
}
