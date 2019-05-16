
import java.util.*;
import java.io.*;

class musicalnotation {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		String G = " G: ";
		String F = "-F: ";
		String E = " E: ";
		String D = "-D: ";
		String C = " C: ";
		String B = "-B: ";
		String A = " A: ";
		String g = "-g: ";
		String f = " f: ";
		String e = "-e: ";
		String d = " d: ";
		String c = " c: ";
		String b = " b: ";
		String a = "-a: ";
		String[] strings = {G,F,E,D,C,B,A,g,f,e,d,c,b,a};
		StringTokenizer reader = new StringTokenizer(file.readLine());
		while (n-->0) {
			String s = reader.nextToken();
			int times = 0;
			if (s.length() == 1) times = 1;
			else {
				times = Integer.parseInt(s.substring(1));
				s = s.substring(0,1);
			}
			while(times-->0) {
				for (int i = 0; i < strings.length; i++) {
					if (strings[i].charAt(1) == s.charAt(0)) {
						strings[i] += "*";
					}
					else {
						strings[i] += strings[i].charAt(0);
					}
				}
			}
			for (int i = 0; i < strings.length; i++) {
				strings[i] += strings[i].charAt(0);
			}
		}
		for (String s : strings) {
			System.out.println(s.substring(1, s.length() - 1));
		}
	}
}
