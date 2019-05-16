import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class wordsfornumbers {

	public static void main(String[] args) throws Exception {
		new wordsfornumbers().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			StringTokenizer reader = new StringTokenizer(line);
			boolean first = true;
			while (reader.hasMoreTokens()) {
				String s = reader.nextToken();
				if (s.matches("[0-9]+")) {
					s = word(Integer.parseInt(s));
				}
				if (first) {
					System.out.print(s.substring(0,1).toUpperCase() + s.substring(1) + " ");
				}
				else {
					System.out.print(s + " ");
				}
				first = false;
			}
			System.out.println();
		}
		file.close();
	}
	public static String word(int n) {
	    int hundreds = (n / 100) % 10;
	    int tens =     (n / 10) % 10;
	    int ones =     (n / 1) % 10;
	    String[] ten = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	    String[] twe = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	    String build = "";
	    
	    if (hundreds > 0)
	        build += ten[hundreds] + "hundred";
	    
	    if (tens >= 2)
	        {
	        build += twe[tens];
	        
	        if (ones > 0)
	            build += "-" + ten[ones];
	        }
	    else
	        build += ten[tens*10 + ones];
	    
	    return build;
	    }
}