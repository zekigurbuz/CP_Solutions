import java.util.stream.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class babylonian {

	public static void main(String[] args) throws Exception {
		new babylonian().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		while (n-->0) {
			int[] arr = Arrays.stream(file.readLine().replaceAll(",", ",0").split(",")).mapToInt(n1 -> Integer.parseInt(n1)).toArray();
			long sum = 0L;
			int place = 0;
			for (int i = arr.length - 1; i >= 0; i--) {
				sum += arr[i] * Math.pow(60, place++);
			}
			System.out.println(sum);
		}
	}
}