import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class rotatecut {

	public static void main(String[] args) throws Exception {
		new rotatecut().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = Integer.parseInt(file.nextLine());
		while (n-- > 0) {
			int num = file.nextInt();
			String line = file.nextLine().trim();
			for (int i = 0; i < num; i++) {
				if (line.length() <= 3) break;
				if (i % 2 == 0) line = line.substring(line.length() / 4);
				else line = line.substring(0, line.length() - line.length() / 4);
			}
			System.out.println(line);
		}
	}
}