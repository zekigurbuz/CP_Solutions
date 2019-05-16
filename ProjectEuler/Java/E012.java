import java.util.ArrayList;

public class E012 {
	public static void main(String[] args) {
		ArrayList<Long> triNums = new ArrayList();
		triNums.add(1L);
		while (numOfDiv(triNums.get(triNums.size() - 1)) < 500) {
			System.out.println(numOfDiv(triNums.get(triNums.size() - 1)) + ": " + triNums.get(triNums.size() - 1));
			triNums.add(triNums.get(triNums.size() - 1) + triNums.size() + 1);
			
		}
		System.out.println(triNums.get(triNums.size() - 1));
	}
	public static int numOfDiv(long l) {
		int total = 0;
		for (long i = 1L; i <= l; i++) {
			if (l % i == 0) total++;
		}
		return total;
	}
}
