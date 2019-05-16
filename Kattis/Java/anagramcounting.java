/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class anagramcounting {
	/** GLOBAL VARIABLES **/
	long times = -1;

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while (file.hasNext()) {
			char[] s = file.nextLine().toCharArray();
			TreeMap<Character, Integer> tm = new TreeMap<>();
			for (int i = 0; i < s.length; i++) {
				if (tm.containsKey(s[i])) {
					tm.put(s[i], tm.get(s[i]) + 1);
				}
				else {
					tm.put(s[i], 1);
				}
			}
			int q = s.length;
			BigInteger r = BigInteger.ONE;
			for (int i = 2; i <= q; i++) {
				r = r.multiply(new BigInteger(i + ""));
			}
			for (char c : tm.keySet()) {
				r = r.divide(new BigInteger(tm.get(c) + ""));
			}
			System.out.println(r);
		}
		file.close();
	}

	/** EXTRAS **/
	public static void main(String[] args) throws Exception {
		new anagramcounting().run();
	}
}
