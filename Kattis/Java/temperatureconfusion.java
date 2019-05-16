import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class temperatureconfusion {

	public static void main(String[] args) throws Exception {
		new temperatureconfusion().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String input = file.readLine();
		double a = Integer.parseInt(input.substring(0, input.indexOf("/")));
		double b = Integer.parseInt(input.substring(input.indexOf("/") + 1));
		double res = (5.0 / 9.0) * (a / b - 32);
		if (res % 1 == 0) {
			System.out.println((int) res + "/" + 1);
		}
		else {
			double top = 1 * res < 0 ? -1 : 1;
			double bottom = 1;
			while (Math.abs(top / bottom) - Math.abs(res) > .00001) {
				if (Math.abs(top / bottom) < Math.abs(res)) {
					top += 1 * res < 0 ? -1 : 1;
				}
				else {
					bottom += 1;
				}
				System.out.println((int) top + "/" + (int) bottom);
			}
			System.out.println((int) top + "/" + (int) bottom);
		}
	}
}