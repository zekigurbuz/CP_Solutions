
import java.util.*;
import java.io.*;

class veci {
	static ArrayList<String> words;

	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String input = file.readLine();
		words = new ArrayList<>();
		permute(input, 0, input.length());
		Collections.sort(words);
		boolean works = false;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).compareTo(input) > 0) {
				System.out.println(words.get(i));
				works = true;
				break;
			}
		}
		if (!works) {
			System.out.println(0);
		}
	}

	public static void permute(String str, int l, int r) {
		if (l == r)
			words.add(str);
		else {
			for (int i = l; i < r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
