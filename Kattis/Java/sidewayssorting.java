
import java.util.*;
import java.io.*;

class sidewayssorting {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			if (line.equals("0 0")) break;
			StringTokenizer reader = new StringTokenizer(line);
			int r = Integer.parseInt(reader.nextToken());
			int c = Integer.parseInt(reader.nextToken());
			Word[] words = new Word[c];
			for (int i = 0; i < c; i++) {
				words[i] = new Word("");
			}
			for (int i = 0; i < r; i++) {
				char[] cur = file.readLine().toCharArray();
				for (int j = 0; j < c; j++) {
					words[j].s += cur[j];
				}
			}
			Arrays.sort(words);
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					System.out.print(words[j].s.charAt(i));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static class Word implements Comparable<Word> {
		public String s;
		public Word(String s) {
			this.s = s;
		}
		public int compareTo(Word o) {
			return s.toLowerCase().compareTo(o.s.toLowerCase());
		}
	}
}
