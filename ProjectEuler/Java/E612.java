import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class E612 {
	public static void main(String[] args) {
		BigInteger total = new BigInteger("0");
		long limit = (long) Math.pow(10, 18);
		for (long i = 1; i < limit; i++) {
			System.out.println(limit - i);
			for (long j = 1; j < i; j++) {
				if (isFriend(i,j)) total = total.add(new BigInteger("1"));
			}
		}
		System.out.println(total.toString());
	}
	public static boolean isFriend(long i , long j) {
		String[] a = Long.toString(i).split("");
		ArrayList<String> b = new ArrayList<String>(Arrays.asList(Long.toString(j).split("")));
		for (String x : a) {
			if (b.contains(x)) {
				return true;
			}
		}
		return false;
	}
}
