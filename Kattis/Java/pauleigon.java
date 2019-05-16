
import java.io.*;
import java.util.*;

class pauleigon {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int[] nums = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	  int n = nums[0];
	  int points = nums[1] + nums[2];
	  int turn = points / n;
	  if (turn % 2 == 0) {
		  System.out.println("paul");
	  }
	  else {
		  System.out.println("opponent");
	  }
  }
}
