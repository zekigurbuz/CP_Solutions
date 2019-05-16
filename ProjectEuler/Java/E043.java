import java.math.BigInteger;
import java.util.ArrayList;

public class E043 {
	static ArrayList<String> perms;
	public static void main(String[] args) {
		BigInteger total = new BigInteger("0");
		perms = new ArrayList();
		permu("1234567890", "");
		for (String s : perms) {
			int s1 = Integer.parseInt(s.substring(1,4));
			int s2 = Integer.parseInt(s.substring(2,5));
			int s3 = Integer.parseInt(s.substring(3,6));
			int s4 = Integer.parseInt(s.substring(4,7));
			int s5 = Integer.parseInt(s.substring(5,8));
			int s6 = Integer.parseInt(s.substring(6,9));
			int s7 = Integer.parseInt(s.substring(7, 10));
			if (s1%2==0&&s2%3==0&&s3%5==0&&s4%7==0&&s5%11==0&&s6%13==0&&s7%17==0) {
				total = total.add(new BigInteger(s));
			}
		}
		System.out.println(total.toString());
	}
	public static void permu(String orig, String goal) {
		if (orig.length() == goal.length()) {
			perms.add(goal);
		}
		else {
			for (int i = 0; i < orig.length(); i++) {
				String cur = orig.substring(i, i + 1);
				if (goal.indexOf(cur) == -1) {
					permu(orig,goal + cur);
				}
			}
		}
	}
}
