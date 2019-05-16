
import java.io.*;
import java.util.*;

class detaileddifferences {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int times = Integer.parseInt(file.nextLine());
	 for (int asdf = 0; asdf < times; asdf++) {
		 char[] one = file.nextLine().toCharArray();
		 char[] two = file.nextLine().toCharArray();
		 System.out.println(String.valueOf(one));
		 System.out.println(String.valueOf(two));
		 String res = "";
		 for (int i = 0; i < one.length; i++) {
			 res += one[i] == two[i] ? "." : "*";
		 }
		 System.out.println(res);
		 System.out.println();
	 }
  }
}
