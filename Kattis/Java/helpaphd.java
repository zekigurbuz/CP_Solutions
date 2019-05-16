
import java.io.*;
import java.util.*;

class helpaphd {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = file.nextInt();
	 file.nextLine();
	 for (int asdf = 0; asdf < times; asdf++) {
		 String line = file.nextLine();
		 if (line.equals("P=NP")) {
			 System.out.println("skipped");
		 }
		 else {
			 int[] nums = Arrays.stream(line.split("\\+")).mapToInt(n -> Integer.parseInt(n)).toArray();
			 System.out.println(nums[0] + nums[1]);
		 }
	 }
  }
}
