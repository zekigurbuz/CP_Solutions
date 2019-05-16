import java.math.BigInteger;

public class E040 {
	public static void main(String[] args) {
		String allNums = "";
		int count = 1;
		while (allNums.length() <= 1000000) {
			allNums += Integer.toString(count);
			count++;
		}
		
		BigInteger total = new BigInteger("1");
		for (int i = 1; i <= 1000000; i *= 10) {
			if (!Character.toString(allNums.charAt(i - 1)).equals("0")) {
			total = total.multiply(new BigInteger(Character.toString(allNums.charAt(i - 1))));
			}
		}
		System.out.println(total.toString());
	}
}
