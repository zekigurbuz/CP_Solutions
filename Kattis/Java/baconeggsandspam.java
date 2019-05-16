
import java.util.*;
import java.io.*;

class baconeggsandspam {
	@SuppressWarnings("serial")
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = file.readLine()) != null) {
			if (line.equals("0")) break;
			int people = Integer.parseInt(line);
			TreeMap<String, ArrayList<String>> map = new TreeMap<>();
			for (int i = 0; i < people; i++) {
				StringTokenizer reader = new StringTokenizer(file.readLine());
				String person = reader.nextToken();
				while (reader.hasMoreTokens()) {
					String s = reader.nextToken();
					if (!map.containsKey(s)) {
						map.put(s,  new ArrayList<String>() {{add(person);}});
					}
					else {
						map.get(s).add(person);
					}
				}
			}
			for (String s : map.keySet()) {
				Collections.sort(map.get(s));
				System.out.print(s +" ");
				for (String t : map.get(s)) {
					System.out.print(t + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
