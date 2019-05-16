
import java.io.*;
import java.util.*;

class estimatingtheareaofacircle {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		while (file.hasNext()) {
			double r = file.nextDouble();
			double m = file.nextDouble();
			double c = file.nextDouble();
			if (r == 0 && m == 0 && c == 0) break;
			System.out.printf("%f %f%n", r * r * Math.PI, c / m * 4 * r * r);
		}
	}
}
