
import java.util.*;
import java.io.*;

class santaklas {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		double height = file.nextDouble();
		double angle = file.nextDouble();
		if (angle <= 180) {
			System.out.println("safe");
		}
		else {
			System.out.println((int) (height / Math.cos(Math.PI * angle / 180 + Math.PI / 2)));
		}
	}
}
