import java.math.BigInteger;

public class E016 {
	public static void main(String[] args) {
		BigInteger b = new BigInteger("1");
		for (int i = 0; i < 1000; i++) {
			b = b.multiply(new BigInteger("2"));
		}
		String s = b.toString();
		long total = 0L;
		for (int i = 0; i < s.length(); i++) {
			total += Integer.parseInt(Character.toString(s.charAt(i)));
		}
		System.out.println(total);
	}
}
