
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

class babelfish {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		StringTokenizer reader;
		while (true) {
			String line = file.readLine();
			if (line.length() == 0)
				break;
			reader = new StringTokenizer(line);
			String a = reader.nextToken();
			String b = reader.nextToken();
			map.put(b, a);
		}
		String line;
		while ((line = file.readLine()) != null) {
			if (map.containsKey(line))
			System.out.println(map.get(line));
			else
			System.out.println("eh");
		}
	}
}
