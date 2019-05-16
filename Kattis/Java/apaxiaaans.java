
import java.io.*;
import java.util.*;

class apaxiaaans {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 String line = file.nextLine();
	 for (int i = 0; i < line.length(); i++) {
		 char c = line.charAt(i);
		 line = line.replaceAll(c +"+",c + "");
	 }
	 System.out.println(line);
  }
}
