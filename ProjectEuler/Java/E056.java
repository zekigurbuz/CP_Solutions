import java.math.BigInteger;

public class E056 {
	public static void main(String[] args) {
		long largest = 0;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				BigInteger aCopy = new BigInteger(String.valueOf(a));
				BigInteger aRef = new BigInteger(String.valueOf(a));
				for (int i = 1; i < b; i++) {
					aCopy = aCopy.multiply(aRef);
				}
				long digitSum = 0;
				String str = aCopy.toString();
				for (int i = 0; i < str.length(); i++) {
					digitSum += Integer.parseInt(Character.toString(str.charAt(i)));
				}
				if (digitSum > largest) largest = digitSum;
			}
		}
		System.out.println(largest);
	}
}
