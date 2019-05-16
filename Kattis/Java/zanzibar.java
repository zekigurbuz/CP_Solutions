
import java.io.*;
import java.util.*;

class zanzibar {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int x = file.nextInt();
	 file.nextLine();
	 while (x-- > 0) {
		 int[] nums = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		 int num = 0;
		 for (int j = 1; j < nums.length; j++) {
			 if (nums[j] > 2 * nums[j-1])
			 num += nums[j] - (2 * nums[j-1]);
		 }
		 System.out.println(num);
	 }
  }
}
