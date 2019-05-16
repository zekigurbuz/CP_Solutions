import java.util.ArrayList;

public class E092 {
	public static void main(String[] args) {
		ArrayList<Long> numsThatWork = new ArrayList();
		int total = 0;
		for (int i = 1; i < 10000000; i++) {
			long tempI = i;
			while (tempI != 89 && tempI != 1) {
				if (numsThatWork.contains(tempI)) {
					numsThatWork.add((long) i); 
					total++;
					break;
				}
				long newTempI = 0;
				String temp = Long.toString(tempI);
				for (int j = 0; j < temp.length(); j++) {
					newTempI += Math.pow(Integer.parseInt(Character.toString(temp.charAt(j))), 2);
				}
				tempI = newTempI;
			}
			if (tempI == 89)  {
				numsThatWork.add((long) i);
				total++;
			}
			System.out.println(i);
		}
		System.out.println(total);
	}
}
