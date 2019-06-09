package study;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Baek_1181 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		ArrayList<String> words = new ArrayList<>();
		
		sc.nextLine();

		for (int i = 0; i < caseNum; i++) {
			words.add(sc.nextLine());
		}

		sc.close();

		TreeSet<String> ts = new TreeSet<String>(words);
		ArrayList<String> words2 = new ArrayList<>(ts);
		
		Collections.sort(words2, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length())
					return -1;
				else if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else
					return 1;
			}

		});
		
		Iterator it = words2.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
