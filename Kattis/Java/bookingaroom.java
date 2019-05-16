
import java.util.*;
import java.io.*;

class bookingaroom {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		int n = Integer.parseInt(reader.nextToken());
		int times = Integer.parseInt(reader.nextToken());
		boolean[] arr = new boolean[n+1];
		while (times-->0) {
			int x = Integer.parseInt(file.readLine());
			arr[x] = true;
		}
		boolean works = false;
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i]) {
				works = true;
				System.out.println(i);
				break;
			}
		}
		if (!works) System.out.println("too late");
	}
}
