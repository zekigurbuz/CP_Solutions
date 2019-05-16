
import java.util.*;
import java.io.*;

class bits {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-- > 0) {
			int maxOnes = 0;
			int input = Integer.parseInt(file.readLine());
			while (input > 0) {
				maxOnes = Math.max(maxOnes, Integer.toBinaryString(input).replaceAll("0", "").length());
				input /= 10;
			}
			System.out.println(maxOnes);
		}
	}
}
