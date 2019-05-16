import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cookingwater {

	public static void main(String[] args) throws Exception {
		new cookingwater().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		int low = 0;
		int high = 1001;
		while (n-->0) {
			StringTokenizer st = new StringTokenizer(file.readLine());
			low = Math.max(low, Integer.parseInt(st.nextToken()));
			high = Math.min(high, Integer.parseInt(st.nextToken()));
		}
		System.out.println(low <= high ? "gunilla has a point" : "edward is right");
	}
}