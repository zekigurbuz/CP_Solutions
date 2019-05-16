
import java.io.*;
import java.util.*;

class reverserot {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 while (file.hasNext()) {
		 int rot = file.nextInt();
		 if (rot == 0) break;
		 String message = file.nextLine().trim();
		 message = new StringBuilder(message).reverse().toString();
		 System.out.println(encrypt(message, rot));
	 }
  }
  public static String encrypt(String message, int rot) {
	  String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.ABCDEFGHIJKLMNOPQRSTUVWXYZ_.ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
	  String res = "";
	  for (int i = 0; i < message.length(); i++) {
		  res += alpha.charAt(alpha.indexOf(message.charAt(i)) + rot);
	  }
	  return res;
  }
}
