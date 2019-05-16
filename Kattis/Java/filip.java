
import java.io.*;
import java.util.*;

class filip {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int[] nums = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(new StringBuilder(n).reverse().toString())).toArray();
	 if (nums[0] > nums[1]) {
		 System.out.println(nums[0]);
	 }
	 else {
		 System.out.println(nums[1]);
	 }
  }
}
