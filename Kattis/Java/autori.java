
import java.io.*;
import java.util.*;

class autori {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 String[] line = file.nextLine().split("-");
	 String res = "";
	 for (String s : line) {
		 res += s.charAt(0);
	 }
	 System.out.println(res);
  }
}
