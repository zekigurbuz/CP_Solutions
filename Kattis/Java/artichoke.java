import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class artichoke {

	public static void main(String[] args) throws Exception {
		new artichoke().run();
	}
	static double p,a,b,c,d;
	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n;
		StringTokenizer st = new StringTokenizer(file.readLine());
		p = Double.parseDouble(st.nextToken());
		a = Double.parseDouble(st.nextToken());
		b = Double.parseDouble(st.nextToken());
		c = Double.parseDouble(st.nextToken());
		d = Double.parseDouble(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		double max = 0.0;
		double big = 0;
		for (int i = 1; i <= n; i++) {
			double cur = price(i);
			if (cur > big) big = cur;
			else if (big - cur > max) max = big - cur;
		}
		System.out.println(max > 0 ? max : 0);
	}
	public static double price(double time) {
		return p * (Math.sin(a * time + b) + Math.cos(c * time + d) + 2);
	}
}