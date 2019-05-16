
import java.util.*;
import java.io.*;

class whatdoesthefoxsay {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			String words = file.readLine();
			StringTokenizer wordAdder = new StringTokenizer(words);
			ArrayList<String> allWords = new ArrayList<>();
			while(wordAdder.hasMoreTokens()) allWords.add(wordAdder.nextToken());
			String line = "";
			while (true) {
				line = file.readLine();
				if (line.equals("what does the fox say?")) break;
				wordAdder = new StringTokenizer(line);
				wordAdder.nextToken();
				while (wordAdder.hasMoreTokens()) {
					String s = wordAdder.nextToken();
					while (allWords.contains(s)) allWords.remove(s);
				}
			}
			System.out.println(allWords.toString().replaceAll("[,\\[\\] ]+", " ").substring(1));
		}
	}
}
