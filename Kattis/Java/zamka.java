
import java.io.*;
import java.util.*;

class zamka {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int low = file.nextInt();
	 int high = file.nextInt();
	 int goal = file.nextInt();
	 int n = -1;
	 int m = -1;
	 for (int i = low; i <= high; i++) {
		 if (digSum(i) == goal) {
			 n = i;
			 break;
		 }
	 }
	 for (int i = high; i >= low; i--) {
		 if (digSum(i) == goal) {
			 m = i;
			 break;
		 }
	 }
	 System.out.println(n);
	 System.out.println(m);
  }
  public static int digSum(int n) {
	  int sum = 0;
	  while (n > 0) {
		  sum += n % 10;
		  n /= 10;
	  }
	  return sum;
  }
}
