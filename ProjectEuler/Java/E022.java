import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E022 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("E022.dat"));
		ArrayList<String> names = new ArrayList();
		String[] line = file.nextLine().split("[\",]");
		for (String l : line) {
			if (l.length() > 0) {
				names.add(l);
			}
		}
		Collections.sort(names);
		BigInteger total = new BigInteger("0");
		for (int i = 0; i < names.size(); i++) {
			long currentScore = 0L;
			currentScore += i + 1;
			String currentName = names.get(i);
			currentScore *= getVal(currentName);
			total = total.add(new BigInteger(Long.toString(currentScore)));
		}
		System.out.println(total.toString());
	}
	public static long getVal(String name) {
		long total = 0L;
		for (int i = 0; i < name.length(); i++) {
			long current = (int) name.charAt(i) - 64;
			total += current;
		}
		return total;
	}
}
