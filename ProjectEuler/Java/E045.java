import java.util.ArrayList;

public class E045 {
	static ArrayList<Integer> triangular;
	static ArrayList<Integer> pentagonal;
	static ArrayList<Integer> hexagonal;
	public static void main(String[] args) {
		 triangular = new ArrayList();
		 pentagonal = new ArrayList();
		 hexagonal = new ArrayList();
		 for (int i = 1; i < 200000; i++) {
			 triangular.add(i * (i + 1) / 2);
			 pentagonal.add(i * (3 * i - 1) / 2);
			 hexagonal.add(i * (2 * i - 1));
		 }
		
		 for (int i = 2; i < triangular.size(); i++) {
			 int x = triangular.get(i);
			 if (pentagonal.contains(x) && hexagonal.contains(x) && x != 40755) {
				 System.out.println(x);
				 break;
			 }
		 }
	}
}
