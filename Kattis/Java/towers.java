
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class towers {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int n = file.nextInt();
	 file.nextLine();
	 ArrayList<Number> nums = new ArrayList<>();
	 for (int i = 0; i < n; i++) {
		 nums.add(new Number(file.nextLine(), i));
	 }
	 Collections.sort(nums);
	 System.out.println("Case 1:");
	 for (Number number : nums) {
		 System.out.println(number.name);
	 }
  }
  public static class Number implements Comparable<Number> {
	  String name;
	  BigInteger value;
	  int id;
	  public Number (String name, int id) {
		  this.name = name;
		  this.id = id;
		  long[] values = Arrays.stream(name.split("\\^")).mapToLong(n -> Long.parseLong(n)).toArray();
		  this.value = new BigInteger(String.valueOf(values[0]));
		  for (int i = 1; i < values.length; i++) { 
			  BigInteger mul = new BigInteger(value.toString());
			  for (int j = 1; j < values[i]; j++) {
				 
				  value = value.multiply(mul);
			  }
		  }
	  }
	  public int compareTo(Number other) {
		  int x = value.compareTo(other.value);
		  if (x < 0) return -1;
		  if (x > 0) return 1;
		  if (this.id < other.id) {
			  return -1;
		  }
		  if (this.id > other.id) {
			  return 1;
		  }
		  return 0;
	  }
  }
}
