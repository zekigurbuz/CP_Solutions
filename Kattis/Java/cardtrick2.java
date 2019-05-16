
import java.util.*;
import java.io.*;

class cardtrick2 {
	static boolean finished;
	
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(file.readLine());
		while (times-->0) {
			finished = false;
			int n = Integer.parseInt(file.readLine());
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
			}
			permutatio(arr, 0);
		}
	}
	public static void permutatio(int[] arr, int min) {
		if (finished) return;
		for (int i = min; i < arr.length; i++) {
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			permutatio(arr, min + 1);
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		if (min == arr.length - 1 && works(arr)) {
			finished = true;
			for (int i : arr) System.out.print(i + " ");
			System.out.println();
		}
	}
	public static boolean works(int[] arr) {
		if (arr.length >= 2 && arr[1] != 1) return false;
		if (arr.length >= 5 && arr[4] != 2) return false;
		ArrayList<Integer> array = new ArrayList<>();
		for (int i : arr) array.add(i);
		int n = 1;
		while (array.size() > 0) {
			Collections.rotate(array,-n);
			int x = array.remove(0);
			if (x != n++) return false;
		}
		return true;
	}
}
