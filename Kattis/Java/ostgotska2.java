
import java.util.*;
import java.io.*;

class ostgotska2 {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		double withA = 0;
		double total = 0;
		StringTokenizer input = new StringTokenizer(file.readLine());
		while (input.hasMoreTokens()) {
			String next = input.nextToken();
			if (next.indexOf("ae") >= 0) {
				withA++;
			}
			total++;
		}
		if (withA / total >= .4) {
			System.out.println("dae ae ju traeligt va");
		}
		else {
			System.out.println("haer talar vi rikssvenska");
		}
	}
}
