import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class E102 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("E102.dat"));
		int total = 0;
		while (file.hasNext()) {
			double[] line = Arrays.stream(file.nextLine().split(",")).mapToDouble(n -> Double.parseDouble(n)).toArray();
			double x1 = line[0];
			double y1 = line[1];
			double x2 = line[2];
			double y2 = line[3];
			double x3 = line[4];
			double y3 = line[5];
			if (isInside(x1,y1,x2,y2,x3,y3,0,0)) total++;
		}
		System.out.println(total);
	}

	static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
		return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
	}

	static boolean isInside(double x1, double y1, double x2, double y2, double x3, double y3, double x, double y) {

		double A = area(x1, y1, x2, y2, x3, y3);
		double A1 = area(x, y, x2, y2, x3, y3);
		double A2 = area(x1, y1, x, y, x3, y3);
		double A3 = area(x1, y1, x2, y2, x, y);
		return (A == A1 + A2 + A3);
	}
}
