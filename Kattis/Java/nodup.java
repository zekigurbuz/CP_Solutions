
import java.io.*;
import java.util.*;

class nodup {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 ArrayList<String> seen = new ArrayList<>();
	 String[] line = file.nextLine().split(" ");
	 boolean repeat = false;
	 for (String s : line) {
		 if (seen.contains(s)) {
			 repeat = true;
			 break;
		 }
		 seen.add(s);
	 }
	 System.out.println(repeat ? "no" : "yes");
  }
}
