
import java.io.*;
import java.util.*;

class onechicken {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int[] nums = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	  int people = nums[0];
	  int chicken = nums[1];
	  int leftOver = chicken - people;
	  if (leftOver >= 0) {
		  System.out.println("Dr. Chaz will have " + leftOver + " piece" + (leftOver == 1 ? "" : "s") + " of chicken left over!");
	  }
	  else {
		  System.out.println("Dr. Chaz needs " + (-leftOver) + " more piece" + (leftOver == -1 ? "" : "s") + " of chicken!");
	  }
  }
}
