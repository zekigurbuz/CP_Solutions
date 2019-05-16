import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class helpme {

	public static void main(String[] args) throws Exception {
		new helpme().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		char[][] mat = new char[8][8];
		for (int i = 0; i < 8; i++) {
			file.readLine();
			String[] c = file.readLine().replaceAll("[\\.:]", "").split("|");
			char[] cur = new char[8];
			for (int j = 1; j < c.length; j+= 2) {
				cur[j / 2] = c[j].equals("|") ? ' ' : c[j].charAt(0);
			}
			System.out.println(String.valueOf(cur));
		}
	}
}