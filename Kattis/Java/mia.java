import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class mia {

	public static ArrayList<String> arr = new ArrayList<String>() {{
		add("11");
		add("22");
		add("33");
		add("44");
		add("55");
		add("66");
	}};
	
	
	public static void main(String[] args) throws Exception {
		new mia().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = file.readLine();
			if (line.equals("0 0 0 0"))
				break;
			StringTokenizer st = new StringTokenizer(line);
			int a1 = Integer.parseInt(st.nextToken());
			int b1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int b2 = Integer.parseInt(st.nextToken());
			Hand p1 = new Hand(a1, b1);
			Hand p2 = new Hand(a2, b2);
			if (p1.compareTo(p2) == -1) {
				System.out.println("Player 1 wins.");
			}
			else if (p1.compareTo(p2) == 1) {
				System.out.println("Player 2 wins.");
			}
			else {
				System.out.println("Tie.");
			}
		}
	}
	public static class Hand implements Comparable <Hand> {
		String val;
		public Hand (int a, int b) {
			if (a > b) {
				val = "" + a + b;
			}
			else {
				val = "" + b + a;
			}
		}
		public int compareTo(Hand o) {
			if (val.equals(o.val)) return 0;
			if (val.equals("21")) return -1;
			if (o.val.equals("21")) return 1;
			if (arr.indexOf(val) > arr.indexOf(o.val)) return -1;
			if (arr.indexOf(val) < arr.indexOf(o.val)) return 1;
 			int x = val.compareTo(o.val);
			if (x < 0) return 1;
			if (x > 0) return -1;
			return 0;
		}
	}
}
