
import java.io.*;
import java.util.*;

class tri {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int a = file.nextInt();
	 int b = file.nextInt();
	 int c = file.nextInt();
	 if (a + b == c) {
		 System.out.println(a + "+" + b + "=" + c);
	 }
	 else if (a == b + c) {
		 System.out.println(a + "=" + b + "+" + c);
	 }
	 else if (a - b  == c) {
		 System.out.println(a + "-" + b + "=" + c);
	 }
	 else if (a == b - c) {
		 System.out.println(a + "=" + b + "-" + c);
	 }
	 else if (a * b == c) {
		 System.out.println(a + "*" + b + "=" + c);
	 }
	 else if (a == b * c) {
		 System.out.println(a + "=" + b + "*" + c);
	 }
	 else if ((double)a / b == c) {
		 System.out.println(a + "/" + b + "=" + c);
	 }
	 else if (a == (double) b / c) {
		 System.out.println(a + "=" + b + "/" + c);
	 }
  }
}
