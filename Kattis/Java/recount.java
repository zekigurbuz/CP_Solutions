
import java.util.*;
import java.io.*;

class recount {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<>();
		double total = 0;
		while (true) {
			String line = file.readLine();
			if (line.equals("***")) break;
			if (map.containsKey(line)) {
				map.put(line, map.get(line) + 1);
			}
			else {
				map.put(line, 1);
			}
			total++;
		}
		int highest = 0;
		for (String s : map.keySet()) {
			highest = Math.max(highest, map.get(s));
		}
		String winner = "";
		int totalCount = 0;
		for (String s : map.keySet()) {
			if (map.get(s) == highest)  {
				winner = s;
				totalCount++;
			}
		}
		if (totalCount == 1) {
			System.out.println(winner);
		}
		else {
			System.out.println("Runoff!");
		}
	}
}
