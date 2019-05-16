import java.math.BigInteger;
import java.util.ArrayList;

public class E119 {
	public static void main(String[] args) {
		ArrayList<BigInteger> as = new ArrayList<>();
		BigInteger current = new BigInteger("1");
		while (as.size() < 30) {
			
			current = current.add(new BigInteger("1"));
		}
	}
	public static long digitSum(BigInteger n) {
		String s = n.toString();
		long total = 0;
		for (int i = 0; i < s.length(); i++) {
			total += Integer.parseInt(Character.toString(s.charAt(i)));
		}
	}
}
