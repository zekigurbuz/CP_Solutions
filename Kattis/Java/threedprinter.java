
import java.util.*;
import java.io.*;

class threedprinter {
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		System.out.println(1 + (int) Math.ceil(Math.log(n) / Math.log(2)));
	}
}
