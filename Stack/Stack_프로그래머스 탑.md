### :computer: Stack_프로그래머스 탑

> 문제 바로가기 : <https://programmers.co.kr/learn/courses/30/lessons/42588>

```java
class Solution {
    public int[] solution(int[] heights) {

        int[] answer = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] > heights[i]) {
                    answer[i] = j+1;
                    break;
                } 
                if (j==0&& heights[i]>= heights[j]) {
                    answer[i]=0;
                }
            }
        }
        return answer;
    }
}

```



### :sparkles: 해결과정

스택을 염두에 두고 풀다보니 생각을 많이 했는데 굳이 스택을 쓸 필요가 없는 간단한 문제였다.



#### :warning: 체크하고 넘어가기

- char형 int형으로 변환
  - char-'0'
  - Character.getNumericValue(input.charAt(i));