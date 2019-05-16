import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class billiard {

	public static void main(String[] args) throws Exception {
		new billiard().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while (file.hasNext()) {
			int a = file.nextInt();
			int b = file.nextInt();
			int c = file.nextInt();
			int d = file.nextInt();
			int e = file.nextInt();
			if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0) break;
			double x = a * d;
			double y = b * e;
			double total = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			double vel = total / c;
			double angle = 180 * Math.acos(x / total) / Math.PI;
			System.out.println(String.format("%.2f %.2f", angle, vel));
		}
	}
}