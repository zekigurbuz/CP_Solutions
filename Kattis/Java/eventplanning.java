import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class eventplanning {

	public static void main(String[] args) throws Exception {
		new eventplanning().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int nPep = file.nextInt();
		int budget = file.nextInt();
		int nHot = file.nextInt();
		int weeks = file.nextInt();
		int minPrice = Integer.MAX_VALUE;
		file.nextLine();
		while (nHot-->0) {
			int price = Integer.parseInt(file.nextLine()) * nPep;
			int[] arr = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
			int min = Arrays.stream(arr).max().getAsInt();
			if (price <= budget && min >= nPep) {
				minPrice = Math.min(minPrice, price);
			}
		}
		if (minPrice < Integer.MAX_VALUE && minPrice <= budget) {
			System.out.println(minPrice);
		}
		else {
			System.out.println("stay home");
		}
	}
}