
import java.util.*;
import java.io.*;

class peragrams {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String input = file.readLine();
		ArrayList<String> duplicates = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			if (duplicates.contains(input.charAt(i)+"")) {
				duplicates.remove(duplicates.indexOf(input.charAt(i) + ""));
			}
			else {
				duplicates.add(input.charAt(i) + "");
			}
		}
		System.out.println(duplicates.size() == 0 ? 0 : duplicates.size() - 1);
	}
}
