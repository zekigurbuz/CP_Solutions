
import java.io.*;
import java.util.*;

class reversebinary {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 System.out.println(Integer.parseInt(new StringBuilder(Integer.toBinaryString(file.nextInt())).reverse().toString(), 2));
  }
}
