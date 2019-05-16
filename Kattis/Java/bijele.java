
import java.io.*;
import java.util.*;

class bijele {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int[] correct = {1,1,2,2,2,8};
	 int[] res = new int[6];
	 int[] cur = Arrays.stream(file.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
	 for (int i = 0; i < 6; i++) {
		 res[i] = correct[i] - cur[i];
	 }
	 String printStatement = "";
	 for (int i : res) printStatement += i + " ";
	 System.out.println(printStatement.trim());
  }
}
