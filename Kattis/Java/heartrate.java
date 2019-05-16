
import java.io.*;
import java.util.*;

class heartrate {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		for (int asdf = 0; asdf < times; asdf++) {
			double b = file.nextDouble();
			double p = file.nextDouble();
			double max = (b + 1) / p * 60;
			double min = (b - 1) / p * 60;
			double average = b / p * 60;
			System.out.printf("%.4f %.4f %.4f%n", min, average, max);
		}
	}
}
