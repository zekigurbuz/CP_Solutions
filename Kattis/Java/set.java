import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.security.acl.Group;

import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class set {

	public static void main(String[] args) throws Exception {
		new set().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		Card[] cards = new Card[12];
		ArrayList<Group> sets = new ArrayList<>();
		for (int i = 0; i < 12; i++) {
			cards[i] = new Card(file.next().toCharArray());
		}
		for (int i = 0; i < 12; i++) {
			for (int j = i + 1; j < 12; j++) {
				for (int x = j + 1; x < 12; x++) {
					ArrayList<Integer> s = new ArrayList<>();
					TreeSet<Character> set1 = new TreeSet<Character>();
					set1.add(cards[i].a);
					set1.add(cards[j].a);
					set1.add(cards[x].a);
					s.add(set1.size());
					TreeSet<Character> set2 = new TreeSet<Character>();
					set2.add(cards[i].b);
					set2.add(cards[j].b);
					set2.add(cards[x].b);
					s.add(set2.size());
					TreeSet<Character> set3 = new TreeSet<Character>();
					set3.add(cards[i].c);
					set3.add(cards[j].c);
					set3.add(cards[x].c);
					s.add(set3.size());
					TreeSet<Character> set4 = new TreeSet<Character>();
					set4.add(cards[i].d);
					set4.add(cards[j].d);
					set4.add(cards[x].d);
					s.add(set4.size());
					Collections.sort(s);
					String toString = s.toString().replaceAll("[\\[\\], ]+", " ").replaceAll(" +", "");
					//System.out.println(toString);
					if (toString.equals("1111") || toString.equals("1333") || toString.equals("1113") || toString.equals("1133") || toString.equals("3333")) {
						sets.add(new Group(i+1,j+1,x+1));
					}
				}
			}
		}
		Collections.sort(sets); 
		boolean works = true;
		for (Group g : sets) {
			works = false;
			System.out.println(g.a + " " + g.b + " " + g.c);
		}
		if (works) {
			System.out.println("no sets");
		}
	}
	public static class Group implements Comparable <Group> {
		int a;
		int b;
		int c;
		public Group (int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		public int compareTo(Group o) {
			if (a < o.a) return -1;
			if (o.a < a) return 1;
			if (b < o.b) return -1;
			if (o.b < b) return 1;
			if (c < o.c) return -1;
			return 1;
		}
	}
	public static class Card {
		char a;
		char b;
		char c;
		char d;
		public Card (char[] arr) {
			a = arr[0];
			b = arr[1];
			c = arr[2];
			d = arr[3];
		}
	}
}