
import java.io.*;
import java.util.*;

class drmmessages {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 String message = file.nextLine();
	 String half1 = message.substring(0, message.length() / 2);
	 String half2 = message.substring(message.length() / 2);
	 int sum1 = 0, sum2 = 0;
	 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 for (int i = 0; i < half1.length(); i++) {
		 sum1 += alphabet.indexOf(half1.charAt(i));
	 }
	 for (int i = 0; i < half2.length(); i++) {
		 sum2 += alphabet.indexOf(half2.charAt(i));
	 }
	 char[] res1 = new char[half1.length()];
	 char[] res2 = new char[half2.length()];
	 for (int i = 0; i < res1.length; i++) {
		 res1[i] = alphabet.charAt((alphabet.indexOf(half1.charAt(i)) + sum1) % 26);
	 }
	 for (int i = 0; i < res2.length; i++) {
		 res2[i] = alphabet.charAt((alphabet.indexOf(half2.charAt(i)) + sum2) % 26);
	 }
	 int[] sums2 = new int[res2.length];
	 for (int i = 0; i < res2.length; i++) {
		 sums2[i] = alphabet.indexOf(res2[i]);
	 }
	 for (int i = 0; i < res1.length; i++) {
		 res1[i] = (char) ((alphabet.charAt((alphabet.indexOf(res1[i]) + sums2[i]) % 26)));
	 }
	 System.out.println(String.valueOf(res1));
  }
}
