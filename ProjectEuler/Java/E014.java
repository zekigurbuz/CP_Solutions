import java.util.ArrayList;

public class E014 {
	public static void main(String[] args) {
		long longestChain = 0L;
		long index = 0L;
		for (int i = 2; i < 1000000; i++) {
			long current = i;
			ArrayList<Long> list = new ArrayList();
			list.add(current);
			while (current != 1) {
				if (current % 2 == 0) {
					list.add(current / 2);
					current /= 2;
				}
				else {
					list.add(current * 3 + 1);
					current = current * 3 + 1;
				}
			}
			if (list.size() > longestChain) { 
				longestChain = list.size();
				index = i;
			}
			}
		System.out.println(Long.toString(index));
		}
		
	}
