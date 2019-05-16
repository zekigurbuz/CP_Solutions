
import java.util.*;
import java.io.*;

class lineup {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		String[] names = new String[times];
		for (int i = 0; i < times;i ++) {
			names[i] = file.readLine();
		}
		boolean isInc = true;
		boolean isDec = true;
		for (int i = 1; i < times; i++) {
			if (names[i].compareTo(names[i-1]) > 0) {
				isDec = false;
			}
			else {
				isInc = false;
			}
		}
		if (isInc) {
			System.out.println("INCREASING");
		}
		else if (isDec) {
			System.out.println("DECREASING");
		}
		else {
			System.out.println("NEITHER");
		}
	}
}
