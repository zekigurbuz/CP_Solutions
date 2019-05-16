
import java.io.*;
import java.util.*;

class ptice {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  String adrian = "ABC";
	  String bruno = "BABC";
	  String goran = "CCAABB";
	  int length = Integer.parseInt(file.readLine());
	  String sequence = file.readLine();
	  int adrianScore = 0;
	  int brunoScore = 0;
	  int goranScore = 0;
	  while (adrian.length() < length || bruno.length() < length || goran.length() < length) {
		  adrian = adrian + adrian;
		  bruno = bruno + bruno;
		  goran = goran + goran;
	  }
	  for (int i = 0; i < sequence.length(); i++) {
		  if (sequence.charAt(i) == adrian.charAt(i)) adrianScore++;
		  if (sequence.charAt(i) == bruno.charAt(i)) brunoScore++;
		  if (sequence.charAt(i) == goran.charAt(i)) goranScore++;
	  }
	  int highestScore = Math.max(Math.max(adrianScore, goranScore), brunoScore);
	  System.out.println(highestScore);
	  if (adrianScore == highestScore) {
		  System.out.println("Adrian");
	  }
	  if (brunoScore == highestScore) {
		  System.out.println("Bruno");
	  }
	  if (goranScore == highestScore) {
		  System.out.println("Goran");
	  }
  }
}
