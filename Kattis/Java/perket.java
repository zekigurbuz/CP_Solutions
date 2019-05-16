import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class perket {

	public static int min;
	
	public static void main(String[] args) throws Exception {
		new perket().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(file.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
		}
		min = Integer.MAX_VALUE;
		recur(1,0,0,a,b);
		System.out.println(min);
	}
	public static void recur(int a, int b, int index, int[] arr, int[] brr) {
		if (a > 1 && b > 0)
		min = Math.min(Math.abs(a - b), min);
		if (index == arr.length) {
			return;
		}
		recur(a,b,index + 1, arr, brr);
		recur(a * arr[index], b + brr[index], index + 1, arr, brr);
	}
}
