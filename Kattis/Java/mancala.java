import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class mancala {

	public static void main(String[] args) throws Exception {
		new mancala().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		while (n-->0) {
			StringTokenizer st = new StringTokenizer(file.readLine());
			int asdf = Integer.parseInt(st.nextToken());
			int marbles = Integer.parseInt(st.nextToken());
			int[] table = new int[81];
			int maxIndex = 0;
			while (marbles > 0) {
				for (int i = 1; i <= 81; i++) {
					if (i > maxIndex) maxIndex = i;
					if (table[i] <= 0)  {
						table[i] = i; break;
					}
					table[i] -= 1;
				}
				marbles--;
			}
			System.out.println(asdf + " " + maxIndex);
			for (int i = 1; i <= maxIndex; i++) {
				System.out.print(table[i] + " ");
				if (i % 10 == 0 && i != maxIndex) System.out.println();
			}
		}
	}
}