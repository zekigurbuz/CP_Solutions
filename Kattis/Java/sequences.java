
import java.io.*;
import java.util.*;

class sequences {
	
	static ArrayList<char[]> sequences;
	
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 sequences = new ArrayList<>();
	 char[] o = file.nextLine().toCharArray();
	 methodOne(o);
	 long total = 0;
	 final long MOD = (long) Math.pow(10, 9) + 7;
	 for (char[] c : sequences) {
		 total += bSort(c);
	 }
	 System.out.println(total % MOD);
  }
  public static int bSort(char[] arr) {
	  int n = arr.length;
	  int t = 0;
      for (int i = 0; i < n-1; i++)
          for (int j = 0; j < n-i-1; j++)
              if (arr[j] > arr[j+1])
              {
            	  t++;
                  char temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
      return t;
  }
  public static void methodOne(char[] orig) {
	  int index1 = 0;
	  for (; index1 < orig.length; index1++) {
		  if (orig[index1] == '?') {
			  break;
		  }
	  }
	  if (index1 == orig.length) {
		  char[] n = new char[orig.length];
		  for (int i = 0; i < orig.length; i++) {
			  n[i] = orig[i];
		  }
		  sequences.add(n);
		  return;
	  }
	  
	  char[] n = new char[orig.length];
	  for (int i = 0; i < orig.length; i++) {
		  n[i] = orig[i];
	  }
	  n[index1] = '0';
	  methodOne(n);
	  orig[index1] = '1';
	  methodOne(orig);
  }
}
