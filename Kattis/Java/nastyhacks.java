
import java.io.*;
import java.util.*;

class nastyhacks {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		for (int i = 0; i < n; i++) {
			int r = file.nextInt();
			int e = file.nextInt();
			int c = file.nextInt();
			e -= c;
			if (r < e) {
				System.out.println("advertise");
			} else if (r > e) {
				System.out.println("do not advertise");
			} else {
				System.out.println("does not matter");
			}
		}
	}
}
