
import java.io.*;
import java.util.*;

class kemija {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 String line = file.nextLine();
	 char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	 for (char c : vowels) {
		 line = line.replaceAll("" + c + 'p' + c, "" + c);
	 }
	 System.out.println(line);
  }
}
