### :computer: Stack_백준알고리즘 1874번

>1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		Stack<Integer> st = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int testCase =Integer.parseInt(br.readLine());
		int nums[] = new int[testCase];
		//ArrayList <String> sign = new ArrayList<>();
		int index = 0;
		
		for(int i =0; i<testCase;i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}

		for(int i =1; i<=testCase; i++) {
			st.push(i);
			sb.append("+\n");
			//sign.add("+");
			while(!st.isEmpty()&&st.peek()==nums[index]) {
				st.pop();
				sb.append("-\n");
				//sign.add("-");
				index++;
			}
		}
		
		if(!st.isEmpty())
			System.out.println("NO");
		else
			System.out.println(sb);
			/*for(int i =0; i<sign.size();i++) {
				System.out.println(sign.get(i));
			}*/
		
	}

}

```



### :star2: 해결과정

1. 원하는 수열을 배열에 저장한다.
2. 스택에 숫자를 집어 넣으면서 스택의 마지막원소(st.peek())와 수열의 인덱스 값을 비교하며 값이 같으면 pop을 하고 다음 인덱스로 넘어간다.
3. 과정이 모두 끝난 후에도 스택에 남아있는 수가 있다면 NO를 출력한다.



### :warning: 체크할 것!

- +와 -를 ArrayList에 저장하여 출력하려고 하였더니 컴파일 에러가 나서 이를 StringBuffer에다 추가하여 출력하여 주었다.

