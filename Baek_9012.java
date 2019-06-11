package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_9012 {

	public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int caseNum = Integer.parseInt(br.readLine());

		boolean chk; 
		char vps;
		String input;
		
		for (int i = 0; i < caseNum; i++) {
			chk = true;
			input = br.readLine();
			Stack<Character> st = new Stack<>();
			
			for(int j =0; j<input.length();j++) {
				vps = input.charAt(j);
			
				if(vps == '(') {
					st.push('(');
				}else if(vps == ')') {
					if(!st.isEmpty()) {
						st.pop();
					}else {
						chk = false;
						break;
					}
				}
			}
			if(!st.isEmpty())
				chk = false;
			
			if(chk)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
