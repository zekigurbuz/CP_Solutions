import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class bubbletea {

	public static void main(String[] args) throws Exception {
		new bubbletea().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = Integer.parseInt(file.nextLine());
		int[] teaP = Arrays.stream(file.nextLine().split(" ")).mapToInt(n1 -> Integer.parseInt(n1)).toArray();
		int m = Integer.parseInt(file.nextLine());
		ArrayList<Integer> prices = new ArrayList<>();
		int[] topP = Arrays.stream(file.nextLine().split(" ")).mapToInt(n1 -> Integer.parseInt(n1)).toArray();
		for (int i = 0; i < n; i++) {
			int[] arr = Arrays.stream(file.nextLine().trim().split(" ")).mapToInt(n1 -> Integer.parseInt(n1) - 1).toArray();
			for (int j = 1; j < arr.length; j++) {
				//System.out.println(topP[arr[j]] + teaP[i]);
				prices.add(topP[arr[j]] + teaP[i]);
			}
		}
		int budget = file.nextInt();
		int stud = 1;
		Collections.sort(prices);
		stud = budget / prices.get(0);
		if (stud > 0) System.out.println(stud - 1);
		else System.out.println(0);
	}
}
