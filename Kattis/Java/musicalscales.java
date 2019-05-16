
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.function.Function;

class musicalscales {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> notes = new ArrayList<String>() {
			{
				add("A");
				add("A#");
				add("B");
				add("C");
				add("C#");
				add("D");
				add("D#");
				add("E");
				add("F");
				add("F#");
				add("G");
				add("G#");
			}
		};
		file.readLine();
		StringTokenizer reader = new StringTokenizer(file.readLine());
		ArrayList<String> song = new ArrayList<>();
		while (reader.hasMoreTokens()) {
			String s = reader.nextToken();
			if (!song.contains(s))
				song.add(s);
		}
		int[] scale = { 2, 2, 1, 2, 2, 2, 1 };
		ArrayList<ArrayList<String>> scales = new ArrayList<>();
		for (int i = 0; i < notes.size(); i++) {
			int index = i;
			ArrayList<String> curScale = new ArrayList<>();
			for (int j = 0; j < scale.length; j++) {
				curScale.add(notes.get(index));
				index += scale[j];
				index %= notes.size();
			}
			scales.add(curScale);
		}
		System.out.println(scales);
		String res = "";
		for (ArrayList<String> curScale : scales) {
			if (curScale.containsAll(song)) {
				res += curScale.get(0) + " ";
			}
		}
		if (res.length() > 0)
			System.out.println(res.trim());
		else
			System.out.println("none");
	}
}
