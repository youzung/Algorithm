### :computer: Stack_프로그래머스 쇠막대기

> <https://programmers.co.kr/learn/courses/30/lessons/42585>

```java
class Solution {
    public int solution(String arrangement) {
        Stack<String> stack = new Stack<>();
        int answer = 0;

        for(int i =0; i<arrangement.length();i++) {
            if(arrangement.charAt(i)=='(')
                stack.push("(");
            else {
                if(arrangement.charAt(i)==')') {
                    if(stack.peek().equals("(")&&arrangement.charAt(i-1)=='(') {
                        stack.pop();
                        answer += stack.size();
                    }else{
                        stack.pop();
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
```



### :sparkles: 해결과정

1. '( 의 경우 push만 해주면 된다. 
2.  ')' 의 경우 바로앞의 문자가 '(' 이면 레이저가 되므로 pop을 해주고 스택의 사이즈를 결과값에 더해준다.
3. ')'가 연달아 나오는 경우 남아있는 막대기가 있으므로 결과 값에 하나를 더 더해줘야 한다.

