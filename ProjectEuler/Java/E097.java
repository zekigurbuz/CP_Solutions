import java.math.BigInteger;

public class E097 {
	public static void main(String[] args) {
		BigInteger val = new BigInteger("1");
		for (int i = 0; i < 7830457; i++) {
			val = val.multiply(new BigInteger("2"));
		}
		val = val.multiply(new BigInteger("28433"));
		val = val.add(new BigInteger("1"));
		System.out.println(val);
				
	}
}
