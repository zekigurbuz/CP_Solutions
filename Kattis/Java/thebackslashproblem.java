import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class thebackslashproblem {

	public static void main(String[] args) throws Exception {
		new thebackslashproblem().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			int level = Integer.parseInt(line);
			String input = file.readLine();
			while (level-->0)
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) >= '!' && input.charAt(i) <= '*' || input.charAt(i) >= '[' && input.charAt(i) <= ']') {
					input = input.substring(0,i) + '\\' + input.substring(i);
					i++;
				}
			}
			System.out.println(input);
		}
	}
}