
import java.util.*;
import java.io.*;

class friday {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			StringTokenizer reader = new StringTokenizer(file.readLine());
			int daysInYear = Integer.parseInt(reader.nextToken());
			int numMonths = Integer.parseInt(reader.nextToken());
			int[] months = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
			int day = 0;
			int friday13 = 0;
			for (int i = 0; i < months.length; i++) {
				for (int j = 0; j < months[i]; j++) {
					if (day == 5 && j == 12) {
						friday13++;
					}
					day++;
					day %= 7;
				}
			}
			System.out.println(friday13);
		}
	}
}
