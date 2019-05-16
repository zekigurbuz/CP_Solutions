import java.util.ArrayList;
import java.util.TreeMap;

public class E002 {
	public static void main(String[] args) {
		long sum = 0L;
		ArrayList<Long> fibNumbers = new ArrayList();
		for (int i = 1; i < 80; i++) {
			fibNumbers.add(fib(i));
		}
		for (long i : fibNumbers) {
			if (i < 4000000 && i % 2 == 0) sum += i;
		}
		System.out.println(Long.toString(sum));
	}
	public static long fib(int n) {
		long[] dic = new long[n + 1];
		dic[0]=1;
		dic[1] = 1;
		for (int i = 2; i <= n; i++) {
			dic[i] = dic[i-1] + dic[i-2];
		}
		return dic[n];
	}
}
