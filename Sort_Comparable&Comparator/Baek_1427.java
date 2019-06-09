package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baek_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split("");
		
		Arrays.sort(num, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(Integer.parseInt(s1) < Integer.parseInt(s2))
					return  1;
				else if(Integer.parseInt(s1) == Integer.parseInt(s2))
					return  0;
				else
					return -1;
			}
			
		});
		
		
		StringBuffer sb = new StringBuffer();
		
		for(int i =0; i<num.length;i++) {
			sb.append(num[i]);
		}
		
		System.out.println(sb);
	}

}
