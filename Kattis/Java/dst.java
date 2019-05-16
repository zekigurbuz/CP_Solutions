import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class dst {

	public static void main(String[] args) throws Exception {
		new dst().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = Integer.parseInt(file.nextLine());
		while (n-->0) {
			char c = file.next().charAt(0);
			int minChange = file.nextInt();
			int hour = file.nextInt();
			int minute = file.nextInt();
			int curTotal = minute + hour * 60;
			if (c == 'F') {
				minChange *= 1;
			}
			else {
				minChange *= -1;
			}
			curTotal += minChange;
			while (curTotal < 0) curTotal += 24 * 60;
			while (curTotal >= 24 * 60) curTotal -= 24 * 60;
			System.out.println(curTotal / 60 + " " + (curTotal % 60));
		}
	}
}