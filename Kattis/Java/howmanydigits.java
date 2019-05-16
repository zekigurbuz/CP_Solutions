import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class howmanydigits {

	public static void main(String[] args) throws Exception {
		new howmanydigits().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			int cur = Integer.parseInt(line);
			System.out.println(cur < 2 ? 1 : (int) Math.ceil(Math.log10(2 * Math.PI * cur) / 2 + cur * (Math.log10(cur / Math.E))));
		}
	}
}