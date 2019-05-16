
import java.util.*;
import java.io.*;

class justaminute {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(file.readLine());
		double t = 0;
		double a = 0;
		for (int i = 0; i < count; i++) {
			StringTokenizer reader = new StringTokenizer(file.readLine());
			double x = Double.parseDouble(reader.nextToken());
			double y = Double.parseDouble(reader.nextToken());
			t += x;
			a += y;
		}
		if (a / 60 / t > 1)
			System.out.printf("%.9f%n", a / 60 / t);
		else
			System.out.println("measurement error");
	}
}
