import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sortofsorting {

	public static void main(String[] args) throws Exception {
		new sortofsorting().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(file.readLine());
			if (n == 0) break;
			Word[] arr = new Word[n];
			for (int i = 0; i < n; i++) {
				arr[i] = new Word(file.readLine(), i);
			}
			Arrays.sort(arr);
			for (Word w : arr) System.out.println(w.mes);
			System.out.println();
		}
	}
	public static class Word implements Comparable <Word> {
		int id;
		String mes;
		public Word (String mes, int id) {
			this.mes = mes;
			this.id = id;
		}
		public int compareTo(Word o) {
			if (this.mes.charAt(0) < o.mes.charAt(0)) return -1;
			if (o.mes.charAt(0) < this.mes.charAt(0)) return 1;
			if (this.mes.charAt(1) < o.mes.charAt(1)) return -1;
			if (o.mes.charAt(1) < this.mes.charAt(1)) return 1;
			return Integer.compare(this.id, o.id);
		}
	}
}