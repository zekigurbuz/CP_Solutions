
import java.util.*;
import java.io.*;

class hittingtargets {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int numShapes = Integer.parseInt(file.readLine());
		Shape[] shapes = new Shape[numShapes];
		for (int i = 0; i < numShapes; i++) {
			StringTokenizer reader = new StringTokenizer(file.readLine());
			String name = reader.nextToken();
			if (name.equals("circle")) {
				double x = Double.parseDouble(reader.nextToken());
				double y = Double.parseDouble(reader.nextToken());
				double r = Double.parseDouble(reader.nextToken());
				shapes[i] = new Circle(x, y, r);
			} else {
				double x1 = Double.parseDouble(reader.nextToken());
				double y1 = Double.parseDouble(reader.nextToken());
				double x2 = Double.parseDouble(reader.nextToken());
				double y2 = Double.parseDouble(reader.nextToken());
				shapes[i] = new Rectangle(x1, y1, x2, y2);
			}
		}
		int numShots = Integer.parseInt(file.readLine());
		for (int i = 0; i < numShots; i++) {
			StringTokenizer reader = new StringTokenizer(file.readLine());
			double x = Double.parseDouble(reader.nextToken());
			double y = Double.parseDouble(reader.nextToken());
			int numHit = 0;
			for (int j = 0; j < shapes.length; j++) {
				if (shapes[j].isHit(x, y)) {
					numHit++;
				}
			}
			System.out.println(numHit);
		}
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static abstract class Shape {
		public abstract boolean isHit(double x, double y);
	}

	public static class Circle extends Shape {
		double x;
		double y;
		double r;

		public Circle(double x, double y, double r) {
			this.x = x;
			this.y = y;
			this.r = r;
		}

		public boolean isHit(double x, double y) {
			return distance(x,y,this.x,this.y) <= r;
		}
	}

	public static class Rectangle extends Shape {
		double x1;
		double y1;
		double x2;
		double y2;

		public Rectangle(double x1, double y1, double x2, double y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		public boolean isHit(double x, double y) {
			return x >= this.x1 && x <= this.x2 && y >= this.y1 && y <= this.y2;
		}
	}
}
