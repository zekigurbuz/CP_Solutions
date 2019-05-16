
import java.util.*;
import java.io.*;

class jabuke {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		Point v1 = new Point(Double.parseDouble(reader.nextToken()),Double.parseDouble(reader.nextToken()));
		reader = new StringTokenizer(file.readLine());
		Point v2 = new Point(Double.parseDouble(reader.nextToken()),Double.parseDouble(reader.nextToken()));
		reader = new StringTokenizer(file.readLine());
		Point v3 = new Point(Double.parseDouble(reader.nextToken()),Double.parseDouble(reader.nextToken()));
		int n = Integer.parseInt(file.readLine());
		int inside = 0;
		double area = AreaT(v1,v2,v3);
		while(n-->0) {
			reader = new StringTokenizer(file.readLine());
			Point pt = new Point(Double.parseDouble(reader.nextToken()),Double.parseDouble(reader.nextToken()));
			if (isInside(pt,v1,v2,v3)) inside++;
		}
		System.out.println(area);
		System.out.println(inside);
	}

	public static double isNeg(Point p1, Point p2, Point p3) {
		return (p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y);
	}

	public static boolean isInside(Point pt, Point v1, Point v2, Point v3) {
//		boolean b1 = isNeg(pt, v1, v2) < 0;
//		boolean b2 = isNeg(pt, v2, v3) < 0;
//		boolean b3 = isNeg(pt, v3, v1) < 0;
//		return ((b1 == b2) && (b2 == b3) && AreaT(v1,v2,v3) > 0);
		double a = AreaT(pt,v2,v3);
		double b = AreaT(v1,pt,v3);
		double c = AreaT(v1,v2,pt);
		return (AreaT(v1,v2,v3) == a + b + c);
	}

	public static double AreaT(Point v1, Point v2, Point v3) {
		return Math.abs(v1.x * (v2.y - v3.y) + v2.x * (v3.y - v1.y) + v3.x * (v1.y - v2.y)) / 2;
	}
	public static class Point {
		double x;
		double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
}
