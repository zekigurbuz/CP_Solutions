import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class phonelist {

	public static void main(String[] args) throws Exception {
		new phonelist().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(file.readLine());
		while (n-- > 0) {
			int t = Integer.parseInt(file.readLine());
			boolean works = true;
			ArrayList<String> arr = new ArrayList<>();
			while (t-- > 0) {
				String cur = file.readLine();
				arr.add(cur);
			}
			Collections.sort(arr);
			for (int i = 1; i < arr.size(); i++) {
				if (arr.get(i).length() > arr.get(i - 1).length() && arr.get(i).startsWith(arr.get(i-1))) {
					works = false;
					break;
				}
				else if (arr.get(i - 1).startsWith(arr.get(i))) {
					works = false;
					break;
				}
			}
			System.out.println(works ? "YES" : "NO");
		}
	}
}