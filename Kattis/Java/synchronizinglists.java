
import java.util.*;
import java.io.*;

class synchronizinglists {
  public static void main (String [] args) throws IOException {
	  Scanner file = new Scanner(System.in);
	  int n = file.nextInt();
	  file.nextLine();
	  while (true) {
		  int[] first = new int[n];
		  int[] second = new int[n];
		  HashMap<Integer, Integer> map = new HashMap<>();
		  for (int i = 0; i < n; i++) {
			  int cur = file.nextInt();
			  map.put(cur, i);
			  first[i] = cur;
		  }
		  for (int i = 0; i < n; i++) {
			  second[i] = file.nextInt();
		  }
		  Arrays.sort(first);
		  Arrays.sort(second);
		  int[] res = new int[n];
		  for (int i = 0; i < n; i++) {
			  res[map.get(first[i])] = second[i];
		  }
		  for (int i : res) System.out.println(i);
		  n = file.nextInt();
		  if (n == 0) break;
		  System.out.println();
	  }
  }
}
