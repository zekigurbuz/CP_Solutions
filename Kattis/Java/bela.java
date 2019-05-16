
import java.io.*;
import java.util.*;

class bela {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 HashMap<Character, int[]> values = new HashMap<>();
	 values.put('A', new int[] {11, 11});
	 values.put('K', new int[] {4, 4});
	 values.put('Q', new int[] {3, 3});
	 values.put('J', new int[] {20, 2});
	 values.put('T', new int[] {10, 10});
	 values.put('9', new int[] {14, 0});
	 values.put('8', new int[] {0, 0});
	 values.put('7', new int[] {0, 0});
	 int n = file.nextInt() * 4;
	 char dom = file.next().charAt(0);
	 file.nextLine();
	 int count = 0;
	 for (int i = 0; i < n; i++) {
		 String line = file.nextLine();
		 char id = line.charAt(0);
		 char suit = line.charAt(1);
		 if (suit == dom) {
			 count += values.get(id)[0];
		 }
		 else {
			 count += values.get(id)[1];
		 }
	 }
	 System.out.println(count);
  }
}
