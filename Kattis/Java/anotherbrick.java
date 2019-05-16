
import java.util.*;
import java.io.*;

class anotherbrick {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		int h = Integer.parseInt(reader.nextToken());
		int w = Integer.parseInt(reader.nextToken());
		int n = Integer.parseInt(reader.nextToken());
		reader = new StringTokenizer(file.readLine());
		int cH = 0;
		int cW = 0;
		boolean works = false;
		for (int i = 0; i < n; i++) {
			int cur = Integer.parseInt(reader.nextToken());
			if (cH >= h) {
				works = true;
				break;
			}
			else if (cur + cW > w) {
				works = false;
				break;
			}
			else if (cur + cW == w) {
				cW = 0;
				cH++;
			}
			else {
				cW += cur;
			}
			
		}
		if (cH >= h) {
			works = true;
		}
		System.out.println(works ? "YES" : "NO");
	}
}
