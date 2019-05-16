
import java.util.*;
import java.io.*;

class tsp {

	static Point[] points;
	static int[] correct;
	static boolean[] seen;

	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int numPoints = Integer.parseInt(file.readLine());
		points = new Point[numPoints];
		for (int i = 0; i < numPoints; i++) {
			StringTokenizer lineReader = new StringTokenizer(file.readLine());
			Point p = new Point(Double.parseDouble(lineReader.nextToken()), Double.parseDouble(lineReader.nextToken()));
			points[i] = p;
		}
		seen = new boolean[numPoints];
		correct = new int[numPoints];
		seen[0] = true;
		recur(0, 1);
		for (int i : correct)
			System.out.println(i);
	}

	public static void recur(int sIndex, int reference) {
		if (reference == points.length)
			return;
		double dist = Double.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < points.length; i++) {
			if (!seen[i]) {
				double curDist = Math.sqrt(
						Math.pow(points[sIndex].x - points[i].x, 2) + Math.pow(points[sIndex].y - points[i].y, 2));
				if (curDist < dist) {
					dist = curDist;
					index = i;
				}
			}
		}
		seen[index] = true;
		correct[index] = reference;
		recur(index, reference + 1);
	}

	static class Point {
		double x;
		double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
}
