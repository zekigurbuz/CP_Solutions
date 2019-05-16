
import java.util.*;
import java.io.*;

class karte {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int p = 13;
	  int k = 13;
	  int h = 13;
	  int t = 13;
	  ArrayList<String> dupChecker = new ArrayList<>();
	  String input = file.readLine();
	  boolean works = true;
	  for (int i = 0; i < input.length(); i+= 3) {
		  String cur = input.substring(i, i + 3);
		  if (dupChecker.contains(cur)) {
			  System.out.println("GRESKA");
			  works = false;
			  break;
		  }
		  dupChecker.add(cur);
		  switch(cur.charAt(0)) {
		  case 'P':
			  p--;
			  break;
		  case 'K':
			  k--;
			  break;
		  case 'H':
			  h--;
			  break;
		  case 'T':
			  t--;
			  break;
		  }
	  }
	  if (works) {
		  System.out.println(p + " " + k + " " + h + " " + t);
	  }
  }
}
