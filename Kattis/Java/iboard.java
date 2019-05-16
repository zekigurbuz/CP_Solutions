import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class iboard {

	public static void main(String[] args) throws Exception {
		new iboard().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			char[] c = line.toCharArray();
			String res = "";
			for (char a : c) {
				String cur = Integer.toBinaryString(a);
				while (cur.length() < 7) cur = '0' + cur;
				res += new StringBuilder(cur).reverse().toString();
			}
			boolean a = false;
			boolean b = false;
			for (int i = 0; i < res.length(); i++) {
				if (res.charAt(i) == '1') a = !a;
				else b = !b;
			}
			System.out.println((a || b) ? "trapped" : "free");
		}
	}
}