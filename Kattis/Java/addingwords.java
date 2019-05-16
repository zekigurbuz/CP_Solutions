
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class addingwords {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<>();
		String line;
		while ((line = file.readLine()) != null) {
			if (line.equals("clear"))
				map = new HashMap<>();
			String[] words = line.split(" ");
			if (words[0].equals("def")) {
				map.put(words[1], Integer.parseInt(words[2]));
			} else if (words[0].equals("calc")) {
				int total = 0;
				boolean works = true;
				if (map.containsKey(words[1]))
					total = map.get(words[1]);
				else
					works = false;
				for (int i = 3; i < words.length - 1; i += 2) {
					String token = words[i];
					if (!map.containsKey(token)) {
						works = false;
						break;
					} else {
						switch (words[i - 1]) {
						case "+":
							total += map.get(token);
							break;
						case "-":
							total -= map.get(token);
							break;
						}
					}
				}
				String res = "";
				for (int i = 1; i < words.length; i++) {
					res += words[i] + " ";
					// System.out.println(words[i]);
				}
				boolean found = false;
				if (works) {
					for (String s : map.keySet()) {
						if (map.get(s) == total) {
							res += s;
							found = true;
							break;
						}
					}
					if (!found) res += "unknown";
				} else
					res += "unknown";
				System.out.println(res);
			}
		}
	}
}
