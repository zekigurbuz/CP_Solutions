import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class zebrasocelots {

	public static void main(String[] args) throws Exception {
		new zebrasocelots().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		String res = "";
		while (n-->0) {
			res += file.readLine();
		}
		res = res.replaceAll("O", "1").replaceAll("Z", "0");
		System.out.println(Long.parseLong(res, 2));
	}
}