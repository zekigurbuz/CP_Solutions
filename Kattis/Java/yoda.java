
import java.util.*;
import java.io.*;

class yoda {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String a = file.readLine();
		String b = file.readLine();
		while(a.length() < b.length()) {
			a = "0" + a;
		}
		while (b.length() < a.length()) {
			b = "0" + b;
		}
		char[] one = a.toCharArray();
		char[] two = b.toCharArray();
		for (int i = 0; i < one.length; i++) {
			if (one[i] < two[i]) {
				one[i] = ' ';
			}
			else if (two[i] < one[i]) {
				two[i] = ' ';
			}
		}
		String res1 = String.valueOf(one).replaceAll(" ", "").length() > 0 ? String.valueOf(one).replaceAll(" ", "") : "YODA";
		String res2 = String.valueOf(two).replaceAll(" ", "").length() > 0 ? String.valueOf(two).replaceAll(" ", "") : "YODA";
		if (res1.matches("0+")) res1 = "0";
		if (res2.matches("0+")) res2 = "0";
		System.out.println(res1 + "\n" + res2);
	}
}
