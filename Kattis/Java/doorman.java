
import java.util.*;
import java.io.*;

class doorman {
	
	static int max;
	static int most;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		max = Integer.parseInt(file.readLine());
		most = 0;
		String people = file.readLine();
		recur(0,0,people, 0);
		System.out.println(most == people.length() ? most : most - 1);
	}
	public static void recur(int men, int women, String people, int total) {
		if (people.length() == 0 || Math.abs(men - women) > max) {
			most = Math.max(most, total);
			return;
		}
		char cur = people.charAt(0);
		recur(men + (cur == 'M' ? 1 : 0), women + (cur == 'W' ? 1 : 0), people.substring(1), total + 1);
		if (people.length() > 1) {
			cur = people.charAt(1);
			recur(men + (cur == 'M' ? 1 : 0), women + (cur == 'W' ? 1 : 0), people.charAt(0) + people.substring(2),
					total + 1);
		}
	}
}
