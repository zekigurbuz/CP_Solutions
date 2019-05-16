import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class triangle {

	public static void main(String[] args) throws Exception {
		new triangle().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int asdf = 1;
		while (file.hasNext()) {
			int n = file.nextInt();
			n = (int) (n * Math.log10(3.0 / 2.0) + Math.log10(3)) + 1;
			System.out.println("Case " + asdf + ": " + n);
			asdf++;
		}
	}
}