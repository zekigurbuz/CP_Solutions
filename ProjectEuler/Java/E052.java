import java.util.ArrayList;
import java.util.Collections;

public class E052 {
	public static void main(String[] args) {
		for (int i = 1; i < Integer.MAX_VALUE / 8; i++) {
			boolean works = true;
			String str = Integer.toString(i);
			ArrayList<String> digits = new ArrayList<String>();
			for (int x = 0; x < str.length(); x++) {
				digits.add(Character.toString(str.charAt(x)));
			}
			Collections.sort(digits);
			for (int j = 2; j <= 6; j++) {
				String str2 = Integer.toString(i * j);
				ArrayList<String> digits2 = new ArrayList<String>();
				for (int x = 0; x < str.length(); x++) {
					digits2.add(Character.toString(str2.charAt(x)));
				}
				Collections.sort(digits2);
				for (int x = 0; x < digits2.size(); x++) {
					if (!digits2.get(x).equals(digits.get(x))) {
						works = false;
					}
				}
			}
			if (works) {
				System.out.println(i);
				break;
			}
		}
	}
}
