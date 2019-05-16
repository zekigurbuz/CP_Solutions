
import java.util.*;
import java.io.*;

class convexpolygonarea {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			String line = file.readLine();
			double[] arr = Arrays.stream(line.substring(line.indexOf(" ") + 1).split(" ")).mapToDouble(n -> Double.parseDouble(n)).toArray();
			double[] x = new double[(arr.length + 1) / 2];
			double[] y = new double[(arr.length + 1) / 2];
			int count = 0;
			for (int i = 0; i < arr.length; i+= 2) {
				x[count++] = arr[i];
			}
			count = 0;
			for (int i = 1; i < arr.length; i += 2) {
				y[count++] = arr[i];
			}
			System.out.println(area(x,y,(arr.length + 1)/ 2));
		}
	}
	public static double area(double[] x, double[] y, int numPoints) {
		double area = 0;
		int j = 0;
		for (int i = numPoints - 1; i >= 0; i--) {
			area += (x[j] + x[i]) * (y[j] - y[i]);
			j = i;
		}
		return area / 2;
	}
}
