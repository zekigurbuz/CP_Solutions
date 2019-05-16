
import java.util.*;
import java.io.*;

class owlandfox {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			int input = Integer.parseInt(file.readLine());
			int d1 = digSum(input);
			for (int i = input - 1; i >= 0; i--) {
				int d2 = digSum(i);
				if (d2 == d1-1) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	public static int digSum (int n) {
		int res = 0;
		while (n>0) {
			res += n%10;
			n/=10;
		}
		return res;
	}
}
