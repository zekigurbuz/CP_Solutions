
import java.util.*;
import java.io.*;

class sjecista {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		int ans = n * (n-1) * (n-2) * (n - 3) / 24;
		System.out.println(ans);
	}
}
