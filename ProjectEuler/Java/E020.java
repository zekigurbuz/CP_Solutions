import java.math.BigInteger;

public class E020 {
	public static void main(String[] args) {
		BigInteger b = new BigInteger("1");
		for (int i = 2; i <= 100; i++) {
			b = b.multiply(new BigInteger(Integer.toString(i)));
		}
		String s = b.toString();
		long total = 0L;
		for (int i = 0; i < s.length(); i++) {
			total += Integer.parseInt(Character.toString(s.charAt(i)));
		}
		System.out.println(Long.toString(total));
	}
}
