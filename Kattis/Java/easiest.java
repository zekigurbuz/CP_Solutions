
import java.io.*;
import java.util.*;

class easiest {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 while (file.hasNext()) {
		 int x = file.nextInt();
		 if (x == 0) break;
		 int goal = digSum(x);
		 for (int i = 11; i < Integer.MAX_VALUE; i++) {
			 if (digSum(i * x) == goal) {
				 System.out.println(i);
				 break;
			 }
		 }
	 }
  }
  public static int digSum(int x) {
	  int res = 0;
	  while (x > 0) {
		  res += x % 10;
		  x /= 10;
	  }
	  return res;
  }
}
