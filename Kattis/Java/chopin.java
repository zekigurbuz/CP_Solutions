
import java.util.*;
import java.io.*;

class chopin {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		HashMap<String, String> map = new HashMap<String, String>() {{
			put("A", "UNIQUE");
			put("A#", "Bb");
			put("Bb", "A#");
			put("B", "UNIQUE");
			put("C", "UNIQUE");
			put("C#", "Db");
			put("Db", "C#");
			put("D", "UNIQUE");
			put("D#", "Eb");
			put("Eb", "D#");
			put("E", "UNIQUE");
			put("F", "UNIQUE");
			put("F#", "Gb");
			put("Gb", "F#");
			put("G", "UNIQUE");
			put("G#", "Ab");
			put("Ab", "G#");
		}};
		int a = 1;
		while ((line = file.readLine()) != null) {
			System.out.print("Case " + (a++) + ": ");
			StringTokenizer reader = new StringTokenizer(line);
			String imp = reader.nextToken();
			if (map.get(imp).equals("UNIQUE")) {
				System.out.println("UNIQUE");
			}
			else {
				System.out.println(map.get(imp) + " " + reader.nextToken());
			}
		}
	}
}
