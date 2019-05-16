
import java.util.*;
import java.io.*;

class bottledup {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		int vol = Integer.parseInt(reader.nextToken());
		int v1 = Integer.parseInt(reader.nextToken());
		int v2 = Integer.parseInt(reader.nextToken());
		int t1 = vol / v1 * v1;
		while (t1 >=0 && (vol - t1) % v2 != 0) t1 -= v1;
		if (t1 >= 0) System.out.println(t1 / v1 + " " + (vol - t1) / v2);
		else if (vol % v2 == 0) System.out.println("0 " + vol / v2);
		else System.out.println("Impossible");
	}
}
