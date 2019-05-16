
import java.util.*;
import java.io.*;

class recipes {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int times = Integer.parseInt(file.nextLine());
		for (int asdf = 1; asdf <= times; asdf++) {
			System.out.println("Recipe # " + asdf);
			int r = file.nextInt();
			int p = file.nextInt();
			int d = file.nextInt();
			String[] names = new String[r];
			double[] vals = new double[r];
			double[] perc = new double[r];
			int mI = -1;
			for (int i = 0; i < r; i++) {
				String name = file.next();
				double val = file.nextDouble();
				double percent = file.nextDouble();
				if (percent == 100.0) mI = i;
				names[i] = name;
				vals[i] = val;
				perc[i] = percent;
			}
			double multiplier = (double) d / p;
			vals[mI] *= multiplier;
			for (int i = 0; i < r; i++) {
				vals[i] = perc[i] * vals[mI] / 100;
			}
			for (int i = 0; i < r; i++) {
				System.out.printf("%s %.1f%n", names[i], vals[i]);
			}
			for (int i = 0; i < 40; i++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
