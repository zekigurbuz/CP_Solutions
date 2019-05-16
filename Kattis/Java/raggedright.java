
import java.io.*;
import java.util.*;

class raggedright {
  public static void main (String [] args) throws IOException {
	  Scanner file = new Scanner(System.in);
	  ArrayList<String> lines = new ArrayList<>();
	  String line;
	 while (file.hasNext()) {
		  line = file.nextLine();
		  lines.add(line);
	  }
	  //lines.remove(lines.size() - 1);
	  int longest = 0;
	  for (String s : lines) longest = Math.max(s.length(), longest);
	  int penalty = 0;
	  for (int i = 0; i < lines.size() - 1; i++) penalty += Math.pow(longest - lines.get(i).length(), 2);
	  System.out.println(penalty);
  }
}
