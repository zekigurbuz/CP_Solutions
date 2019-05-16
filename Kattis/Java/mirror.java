
import java.util.*;
import java.io.*;

class mirror {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		for (int i = 1; i <= times; i++) {
			Stack<String> s = new Stack<>();
			String line;
			StringTokenizer l = new StringTokenizer(file.readLine());
			int n = Integer.parseInt(l.nextToken());
			for (int j = 0; j < n; j++)
			{
				line = file.readLine();
				s.push(new StringBuilder(line).reverse().toString());
			}
			System.out.println("Test " + i);
			while (!s.isEmpty()) {
				System.out.println(s.pop());
			}
		}
	}
}
