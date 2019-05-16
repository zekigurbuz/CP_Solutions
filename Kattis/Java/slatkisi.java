
import java.util.*;
import java.io.*;

class slatkisi {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		double amount = Double.parseDouble(reader.nextToken());
		double bill = Math.pow(10, Double.parseDouble(reader.nextToken()));
		amount /= bill;
		System.out.printf("%.0f%n", Math.round(amount) * bill);
	}
}
