import java.util.ArrayList;
import java.util.Collections;

public class E041 {
	public static void main(String[] args) {
		for (int i = 7654321; i > 0;) {
			if (isPrime(i) && isPan(i)) {
				System.out.println(i);
				break;
			}
			String str = Integer.toString(i);
			if (str.contains("0")) {
				int ind = Integer.parseInt(str.substring(str.indexOf("0") + 1)) + 1;
				i -= ind;
			}
			if (i % 2 == 0) i --;
			else {
				i -= 2;
			}
			System.out.println(i);
		}
	}
	public static boolean isPrime(int i) {
		if (i == 2 || i == 3) return true;
		if (i % 3 == 0 || i % 2 == 0 || i == 1) return false;
		int j = 5;
		int w = 2;
		while (j * j <= i)
		{	
		if (i % j == 0) return false;
		j += w;
		w = 6 - w;
		}
		return true;
	}
	public static boolean isPan(int n) {
		String str = Integer.toString(n);
		ArrayList<Integer> digits = new ArrayList();
		if (str.contains("0")) return false;
		for (int i = 0; i < str.length(); i++) {
			digits.add(Integer.parseInt(Character.toString(str.charAt(i))));
		}
		for (int i = 1; i <= str.length(); i++) {
			if (Collections.frequency(digits, i) != 1) {
				return false;
			}
		}
		return true;
	}
}
