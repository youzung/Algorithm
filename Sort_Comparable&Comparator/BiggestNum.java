package study;

import java.util.*;

public class BiggestNum {
	public static String solution(int[] numbers) {
		String answer ="";
		
		String[] s = new String[numbers.length];
		for(int i =0; i<s.length;i++) {
			s[i] = String.valueOf(numbers[i]);
		} 
		
		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return (s2+s1).compareTo(s1+s2);				
			}
		});
		
		if(s[0].equals("0"))
			return "0";
		
		for(int i =0; i<s.length ;i++) {
			answer += s[i];
		}
		
		return answer;
	}
	
	/*public static void main(String[] args) {
		int [] numbers = {6,10,2};
		
		System.out.print(solution(numbers));
	}*/
	
}
