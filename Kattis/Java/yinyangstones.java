
import java.util.*;
import java.io.*;

class yinyangstones {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String input = file.readLine();
		String white = input.replaceAll("B", "");
		String black = input.replaceAll("W", "");
		System.out.println(white.length() == black.length() ? 1 : 0);
	}
}
