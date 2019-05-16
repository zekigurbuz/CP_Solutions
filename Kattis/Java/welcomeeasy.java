
import java.util.*;
import java.io.*;

class welcomeeasy {
	
	static String wel = "welcome to code jam";
	static long count;
	static String input;
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		for (int asdf = 1; asdf <= times; asdf++) {
			System.out.print("Case #" + asdf + ": ");
			input = file.readLine();
			count = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == 'w') {
					recur("w", i);
				}
			}
			String output = String.valueOf(count);
			while(output.length() < 4) {
				output = "0" + output;
			}
			if (output.length() > 4) {
				output = output.substring(output.length() - 4);
			}
			System.out.println(output);
		}
	}
	public static void recur(String current, int index) {
		if (current.equals(wel)) {
			count++;
			return;
		}
		if (index == input.length()) return;
		if (input.charAt(index) == wel.charAt(current.length())) {
			recur(current + input.charAt(index), index + 1);
		}
			recur(current, index + 1);
	}
}
