import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class bishops {

	public static void main(String[] args) throws Exception {
		new bishops().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			int x = Integer.parseInt(line);
			if (x <= 1) System.out.println(x);
			else System.out.println(2 * x - 2);
		}
	}
}
