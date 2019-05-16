
import java.io.*;
import java.util.*;

class everywhere {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			TreeSet<String> distinct = new TreeSet<>();
			int x = file.nextInt();
			file.nextLine();
			for (int i = 0; i < x; i++) {
				String next = file.nextLine();
				distinct.add(next);
			}
			System.out.println(distinct.size());
		}
	}
}
