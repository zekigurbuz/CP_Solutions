
import java.util.*;
import java.io.*;

class tetration {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		double input = Double.parseDouble(file.readLine());
		System.out.printf("%.6f%n", Math.pow(input, 1/input));
	}
}
