
import java.util.*;
import java.io.*;

class quiteaproblem {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			line = line.toLowerCase();
			System.out.println(line.contains("problem") ? "yes" : "no");
		}
	}
}
