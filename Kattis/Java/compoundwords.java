
import java.io.*;
import java.util.*;

class compoundwords {
  public static void main (String [] args) throws IOException {
	  Scanner file = new Scanner(System.in);
	  TreeSet<String> words = new TreeSet<>();
	  ArrayList<String> allWords = new ArrayList<>();
	  while (file.hasNext()) {
		  allWords.add(file.next());
	  }
	  for (int i = 0; i < allWords.size(); i++) {
		  for (int j = i + 1; j < allWords.size(); j++) {
			  words.add(allWords.get(i) + allWords.get(j));
			  words.add(allWords.get(j) + allWords.get(i));
		  }
	  }
	  for (String s : words) {
		  System.out.println(s);
	  }
  }
}
