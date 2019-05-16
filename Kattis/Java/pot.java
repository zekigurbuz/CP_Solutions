
import java.io.*;
import java.util.*;

class pot {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int n = file.nextInt();
	 file.nextLine();
	 int total = 0;
	 for (int i = 0; i < n; i++) {
		 total += powerizer(file.nextLine());
	 }
	 System.out.println(total);
  }
  public static int powerizer(String s) {
	  int base = Integer.parseInt(s.substring(0, s.length() - 1));
	  int power = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1)));
	  return (int) Math.pow(base, power);
  }
}
