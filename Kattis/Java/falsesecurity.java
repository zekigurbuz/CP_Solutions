
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

class falsesecurity {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  HashMap<Character, String> map = new HashMap<Character, String>() {{
		  put('A', ".-");
		  put('B', "-...");
		  put('C', "-.-.");
		  put('D', "-..");
		  put('E', ".");
		  put('F', "..-.");
		  put('G', "--.");
		  put('H', "....");
		  put('I', "..");
		  put('J', ".---");
		  put('K', "-.-");
		  put('L', ".-..");
		  put('M', "--");
		  put('N', "-.");
		  put('O', "---");
		  put('P', ".--.");
		  put('Q', "--.-");
		  put('R', ".-.");
		  put('S', "...");
		  put('T', "-");
		  put('U', "..-");
		  put('V', "...-");
		  put('W', ".--");
		  put('X', "-..-");
		  put('Y', "-.--");
		  put('Z', "--..");
		  put('_', "..--");
		  put(',', ".-.-");
		  put('.', "---.");
		  put('?', "----");
	  }};
	  HashMap<String, Character> map2 = new HashMap<String, Character>();
	  for (Character s : map.keySet()) {
		  map2.put(map.get(s), s);
	  }
	  String line;
	  while ((line = file.readLine()) != null) {
		  String morseVersion = "";
		  String ints = "";
		  for (int i = 0; i < line.length(); i++) {
			  morseVersion += map.get(line.charAt(i));
			  ints += map.get(line.charAt(i)).length();
		  }
		  ints = new StringBuilder(ints).reverse().toString();
		  String res = "";
		  int index = 0;
		  int[] jumps = Arrays.stream(ints.split("")).mapToInt(n -> Integer.parseInt(n)).toArray();
		  for (int i = 0; i < jumps.length; i++) {
			  res += map2.get(morseVersion.substring(index, index + jumps[i]));
			  index += jumps[i];
		  }
		  System.out.println(res);
	  }
  }
}
