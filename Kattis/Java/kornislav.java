
import java.io.*;
import java.util.*;

class kornislav {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int[] nums = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	 Arrays.sort(nums);
	 System.out.println(nums[0] * nums[2]);
  }
}
