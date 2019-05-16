
import java.io.*;
import java.util.*;

class oddmanout {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = file.nextInt();
	 file.nextLine();
	 for (int asdf = 0; asdf < times; asdf++) {
		 int numInts = file.nextInt();
		 file.nextLine();
		 int[] nums = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		 HashMap<Integer, Integer> map = new HashMap<>();
		 for (int i : nums) {
			 if (map.containsKey(i)) {
				 map.put(i, map.get(i) + 1);
			 }
			 else {
				 map.put(i, 1);
			 }
		 }
		 System.out.print("Case #" + (asdf+1));
		 for (int i : map.keySet()) {
			 if (map.get(i) == 1) {
				 System.out.println(": " + i);
				 break;
			 }
		 }
	 }
  }
}
