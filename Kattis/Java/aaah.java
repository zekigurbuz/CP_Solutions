
import java.util.*;
import java.io.*;

class aaah {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String jon = file.readLine();
		String doc = file.readLine();
		System.out.println(jon.length() >= doc.length() ? "go" : "no");
	}
}
