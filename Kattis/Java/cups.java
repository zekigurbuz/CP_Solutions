
import java.io.*;
import java.util.*;

class cups {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int numCups = Integer.parseInt(file.nextLine());
	 Cup[] cups = new Cup[numCups];
	 for (int i = 0; i < numCups; i++) {
		 cups[i] = new Cup(file.nextLine());
	 }
	 Arrays.sort(cups);
	 for (Cup c : cups) {
		 System.out.println(c.color);
	 }
  }
  public static class Cup implements Comparable<Cup> {
	  String color;
	  float size;
	  public Cup(String data) {
		  String[] split = data.split(" ");
		  if (Character.isAlphabetic(split[0].charAt(0))) {
			  this.color = split[0];
			  this.size = Float.parseFloat(split[1]);
		  }
		  else {
			  this.color = split[1];
			  this.size = Float.parseFloat(split[0]) / 2;
		  }
	  }
	  public int compareTo(Cup other) {
		  return Float.compare(this.size, other.size);
	  }
  }
}
