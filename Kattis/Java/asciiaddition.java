import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class asciiaddition {
	
	public static HashMap<Character, String> map1 = new HashMap<Character, String>() {{
	  put('0',  "xxxxx" + 
				"x...x" + 
				"x...x" + 
				"x...x" + 
				"x...x" + 
				"x...x" + 
				"xxxxx");
	  
	  put('1',  "....x" + 
				"....x" + 
				"....x" + 
				"....x" + 
				"....x" + 
				"....x" + 
				"....x");
	  
	  put('2',  "xxxxx" + 
				"....x" + 
				"....x" + 
				"xxxxx" + 
				"x...." + 
				"x...." + 
				"xxxxx");
	  
	  put('3',  "xxxxx" + 
				"....x" + 
				"....x" + 
				"xxxxx" + 
				"....x" + 
				"....x" + 
				"xxxxx");
	  
	  put('4',  "x...x" + 
				"x...x" + 
				"x...x" + 
				"xxxxx" + 
				"....x" + 
				"....x" + 
				"....x");
	  
      put('5',  "xxxxx" + 
				"x...." + 
				"x...." + 
				"xxxxx" + 
				"....x" + 
				"....x" + 
				"xxxxx");
      
	  put('6',  "xxxxx" + 
				"x...." + 
				"x...." + 
				"xxxxx" + 
				"x...x" + 
				"x...x" + 
				"xxxxx");
	  
	  put('7',  "xxxxx" + 
				"....x" + 
				"....x" + 
				"....x" + 
				"....x" + 
				"....x" + 
				"....x");
	  
	  put('8',  "xxxxx" + 
				"x...x" + 
				"x...x" + 
				"xxxxx" + 
				"x...x" + 
				"x...x" + 
				"xxxxx");
	  
	  put('9',  "xxxxx" + 
				"x...x" + 
				"x...x" + 
				"xxxxx" + 
				"....x" + 
				"....x" + 
				"xxxxx");
	  
      put('+',  "....." + 
				"..x.." + 
				"..x.." + 
				"xxxxx" + 
				"..x.." + 
				"..x.." + 
				".....");
	}};

	public static HashMap<String, Integer> map2;
	
	public static void main(String[] args) throws Exception {
		new asciiaddition().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		map2 = new HashMap<>();
		for (Map.Entry<Character, String> entry : map1.entrySet()) {
			map2.put(entry.getValue(), entry.getKey() - 48);
		}
		char[][] mat = new char[7][];
		for (int i = 0; i < 7; i++) {
			mat[i] = file.readLine().toCharArray();
		}
	}
}