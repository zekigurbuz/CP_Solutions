
import java.util.*;
import java.io.*;

class simon {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			String input = file.readLine();
			if (input.startsWith("simon says ")) {
				System.out.println(input.substring(11));
			}
			else {
				System.out.println();
			}
		}
	}
}
