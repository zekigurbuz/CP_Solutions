
import java.util.*;
import java.io.*;

class redrover {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String input = file.readLine();
		int lowest = input.length();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				String sub = input.substring(i,j);
				lowest = Math.min(lowest, new String(sub + input.replaceAll(sub, "M")).length());
			}
		}
		System.out.println(lowest);
	}
}
