
import java.util.*;
import java.io.*;

class erase {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		boolean diff = Integer.parseInt(file.readLine()) % 2 == 1;
		String input1 = file.readLine();
		String input2 = file.readLine();
		if (!diff && input1.equals(input2)) {
			System.out.println("Deletion succeeded");
		}
		else if (diff && input1.replaceAll("0", "A").replaceAll("1", "0").replaceAll("A", "1").equals(input2)) {
			System.out.println("Deletion succeeded");
		}
		else {
			System.out.println("Deletion failed");
		}
	}
}
