package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek_9012 {

	public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int caseNum = Integer.parseInt(br.readLine());

		boolean isVps; 
		char vps;
		String input;
		
		for (int i = 0; i < caseNum; i++) {
			isVps = true;
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
						isVps = false;
						break;
					}
				}
			}
			if(!st.isEmpty())
				isVps = false;
			
			if(isVps)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}