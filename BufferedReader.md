## 입출력



###  BufferedReader

> Scanner는 느린 경우가 많기 떄문에, 입력이 많은 경우에는 BufferedReader를 사용하는 것이 좋다.

- 네 수 (백준 10824)  

```java
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nums[] = br.readLine().split(" ");
		
		String num1 = nums[0]+nums[1];
		String num2 = nums[2] + nums[3];
        
		long result = Long.valueOf(num1) + Long.valueOf(num2);
        
		System.out.print(result);
		
	}

}
```

* 체크
  * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  * 예외처리 해줘야 함 > throws IOException , try/catch
  * string 을 int로 바꾸기 = Integer.parseInt() (Integer.valueOf())
  * int를 string으로 바꾸기 = Integer.toString()