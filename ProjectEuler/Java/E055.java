import java.math.BigInteger;

public class E055 {
	public static void main(String[] args) {
		int totalAmount = 0;
		for (int i = 1; i < 10000; i++) {
			int counter = 0;
			boolean works = false;
			BigInteger current = new BigInteger(String.valueOf(i));
			while (counter++ < 50 && !works) {
				String str = current.toString();
				StringBuilder temp = new StringBuilder(str);
				temp = temp.reverse();
				current = current.add(new BigInteger(temp.toString()));
				if (isPalindromic(current)) {
					works = true;
				}
			}
			if (!works) totalAmount++;
		}
		System.out.println(totalAmount);
	}
	public static boolean isPalindromic(BigInteger n) {
		String str = String.valueOf(n);
		StringBuilder temp = new StringBuilder(str);
		temp = temp.reverse();
		String rts = temp.toString();
		return str.equals(rts);
	}
}
