
import java.util.*;
import java.io.*;

class vauvau {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer reader = new StringTokenizer(file.readLine());
		int a = Integer.parseInt(reader.nextToken());
		int b = Integer.parseInt(reader.nextToken());
		int c = Integer.parseInt(reader.nextToken());
		int d = Integer.parseInt(reader.nextToken());
		reader = new StringTokenizer(file.readLine());
		int p = Integer.parseInt(reader.nextToken());
		int m = Integer.parseInt(reader.nextToken());
		int g = Integer.parseInt(reader.nextToken());
		int tempA = a;
		int tempB = b;
		int tempC = c;
		int tempD = d;
		int pDog = 2;
		int mDog = 2;
		int gDog = 2;
		for (int i = 1; i < p; i++) {
			if (a > 0) {
				a--;
				if (a == 0) {
					pDog--;
				}
			}
			else if (b > 0) {
				b--;
				if (b == 0) {
					pDog++;
					a = tempA;
					b = tempB;
				}
			}
			if (c > 0) {
				c--;
				if (c == 0) {
					pDog--;
				}
			}
			else if (d > 0) {
				d--;
				if (d == 0) {
					pDog++;
					c = tempC;
					d = tempD;
				}
			}
		}
		a = tempA;
		b = tempB;
		c = tempC;
		d = tempD;
		for (int i = 1; i < m; i++) {
			if (a > 0) {
				a--;
				if (a == 0) {
					mDog--;
				}
			}
			else if (b > 0) {
				b--;
				if (b == 0) {
					mDog++;
					a = tempA;
					b = tempB;
				}
			}
			if (c > 0) {
				c--;
				if (c == 0) {
					mDog--;
				}
			}
			else if (d > 0) {
				d--;
				if (d == 0) {
					mDog++;
					c = tempC;
					d = tempD;
				}
			}
		}
		a = tempA;
		b = tempB;
		c = tempC;
		d = tempD;
		for (int i = 1; i < g; i++) {
			if (a > 0) {
				a--;
				if (a == 0) {
					gDog--;
				}
			}
			else if (b > 0) {
				b--;
				if (b == 0) {
					gDog++;
					a = tempA;
					b = tempB;
				}
			}
			if (c > 0) {
				c--;
				if (c == 0) {
					gDog--;
				}
			}
			else if (d > 0) {
				d--;
				if (d == 0) {
					gDog++;
					c = tempC;
					d = tempD;
				}
			}
		}
		if (pDog == 2) {
			System.out.println("both");
		}
		else if (pDog == 1) {
			System.out.println("one");
		}
		else {
			System.out.println("none");
		}
		if (mDog == 2) {
			System.out.println("both");
		}
		else if (mDog == 1) {
			System.out.println("one");
		}
		else {
			System.out.println("none");
		}
		if (gDog == 2) {
			System.out.println("both");
		}
		else if (gDog == 1) {
			System.out.println("one");
		}
		else {
			System.out.println("none");
		}
	}
}
