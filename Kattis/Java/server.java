
import java.util.*;
import java.io.*;

class server {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer lineReader = new StringTokenizer(file.readLine());
		int numTasks = Integer.parseInt(lineReader.nextToken());
		int time = Integer.parseInt(lineReader.nextToken());
		int[] tasks = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		int index = 0;
		int completed = 0;
		while (index < numTasks && time >= tasks[index]) {
			completed++;
			time -= tasks[index++];
		}
		System.out.println(completed);
	}
}
