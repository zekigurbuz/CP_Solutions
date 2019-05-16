import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pachydermpeanutpacking {

	public static void main(String[] args) throws Exception {
		new pachydermpeanutpacking().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while (file.hasNext()) {
			int numBox = Integer.parseInt(file.nextLine());
			if (numBox == 0) break;
			Box[] boxes = new Box[numBox];
			while (numBox-->0) {
				double x1 = file.nextDouble();
				double y1 = file.nextDouble();
				double x2 = file.nextDouble();
				double y2 = file.nextDouble();
				String size = file.nextLine().trim();
				boxes[boxes.length - 1 - numBox] = new Box(x1, x2, y1, y2, size);
			}
			int numPeanut = Integer.parseInt(file.nextLine());
			Nut[] peanuts = new Nut[numPeanut];
			while (numPeanut-->0) {
				double x = file.nextDouble();
				double y = file.nextDouble();
				String size = file.nextLine().trim();
				peanuts[peanuts.length - 1 - numPeanut] = new Nut(x,y,size);
			}
			for (int i = 0; i < peanuts.length; i++) {
				int j;
				System.out.print(peanuts[i].size + " ");
				for (j = 0; j < boxes.length; j++) {
					if (peanuts[i].x >= boxes[j].x1 && peanuts[i].x <= boxes[j].x2 && peanuts[i].y >= boxes[j].y1 && peanuts[i].y <= boxes[j].y2) {
						System.out.println(boxes[j].size.equals(peanuts[i].size) ? "correct" : boxes[j].size);
						break;
					}
				}
				if (j == boxes.length) {
					System.out.println("floor");
				}
			}
			System.out.println();
		}
	}
	public static class Box {
		double x1;
		double x2;
		double y1;
		double y2;
		String size;
		public Box (double x1, double x2, double y1, double y2, String size) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
			this.size = size;
		}
	}
	public static class Nut {
		double x;
		double y;
		String size;
		public Nut (double x, double y, String size) {
			this.x = x;
			this.y = y;
			this.size = size;
		}
	}
}