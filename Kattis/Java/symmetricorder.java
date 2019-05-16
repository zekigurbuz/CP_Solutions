
import java.io.*;
import java.util.*;

class symmetricorder {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(System.in);
		int asdf = 1;
		while (file.hasNext()) {
			int x = file.nextInt();
			if (x == 0)
				break;
			file.nextLine();
			System.out.println("SET " + asdf);
			String[] names = new String[x];
			int b = 0;
			int e = names.length - 1;
			for (int i = 0; i < x; i++) {
				if (i % 2 == 0) {
					names[b++] = file.nextLine();
				}
				else {
					names[e--] = file.nextLine();
				}
			}
			for (String s : names) {
				System.out.println(s);
			}
			asdf++;
		}
	}
}
