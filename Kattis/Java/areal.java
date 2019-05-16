
import java.util.*;
import java.io.*;

class areal {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		double input = Double.parseDouble(file.readLine());
		System.out.println(Math.sqrt(input) * 4);
	}
}
