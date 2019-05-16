
import java.util.*;
import java.io.*;

class pervasiveheartmonitor {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			String name = "";
			int count = 0;
			double heartRate = 0.0;
			StringTokenizer reader = new StringTokenizer(line);
			while (reader.hasMoreTokens()) {
				String cur = reader.nextToken();
				if (cur.matches("[0-9\\.]+")) {
					double d = Double.parseDouble(cur);
					count++;
					heartRate += d;
				}
				else {
					name += cur + " ";
				}
			}
			System.out.printf("%.6f %s%n", heartRate / count, name.trim());
		}
	}	
}
