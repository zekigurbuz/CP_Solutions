
import java.util.*;
import java.io.*;

class bus {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			int k = Integer.parseInt(file.readLine());
			double res = 0;
			while (k-->0) {
				res += 0.5;
				res *= 2;
			}
			System.out.println((int)res);
		}
	}
}
