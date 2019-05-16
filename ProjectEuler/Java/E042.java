import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class E042 {
	public static void main(String[] args) throws FileNotFoundException {
		int t = 0;
		Scanner file = new Scanner(new File("E042.dat"));
		ArrayList<Integer> triNums = new ArrayList();
		for (int i = 1; i < 10000; i++) {
			triNums.add((int) (i * .5 * (i + 1)));
		}
		String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (file.hasNext()) {
			String[] n = file.next().split("");
			int total = 0;
			for (String s : n) {
				total += key.indexOf(s) + 1;
			}
			if (triNums.contains(total)) t++;
		}
		System.out.println(t);
	}
}
