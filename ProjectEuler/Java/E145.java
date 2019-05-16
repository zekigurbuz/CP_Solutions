import java.math.BigInteger;

public class E145 {
	public static void main(String[] args) {
		String evens = "02468";
		int total = 0;
		for (int i = 1; i < 1000000000; i++) {
			BigInteger g = new BigInteger(Integer.toString(i));
			String temp = new StringBuilder(Integer.toString(i)).reverse().toString();
			if (temp.charAt(0) == '0') continue;
			BigInteger x = new BigInteger(temp);
			g = g.add(x);
			String t = g.toString();
			boolean works = true;
			for (int j = 0; j < t.length(); j++) {
				if (evens.indexOf(t.charAt(j)) > -1) works = false;
			}
			if (works)  {
				total++;
			}
		}
		System.out.println(total);
	}
}
