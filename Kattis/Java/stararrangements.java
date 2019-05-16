
import java.io.*;
import java.util.*;

class stararrangements {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int num = file.nextInt();
	 ArrayList<int[]> pairs = new ArrayList<>();
	 for (int i = 1; i < num; i++) {
		 for (int j = i; j <= i + 1 && j < num; j++) {
			 int[] pair = {j, i};
			 int sum = 0;
			 int x = 0;
			 while (sum < num) {
				 if (x % 2 == 0) {
					 sum += pair[0];
				 }
				 else {
					 sum += pair[1];
				 }
				 x++;
			 }
			 if (sum == num) {
				 pairs.add(new int[] {j,i});
			 }
		 }
	 }
	 System.out.println(num + ":");
	 pairs.remove(0);
	 for (int[] pair : pairs) {
		 System.out.println(pair[0] + "," + pair[1]);
	 }
  }
}
