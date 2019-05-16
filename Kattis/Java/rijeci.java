
import java.io.*;
import java.util.*;

class rijeci {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int num = file.nextInt();
	 int aCount = 1;
	 int bCount = 0;
	 for (int i = 0; i < num; i++) {
		 int temp = bCount;
		 bCount += aCount;
		 aCount = temp;
	 }
	 System.out.println(aCount + " " + bCount);
  }
}
