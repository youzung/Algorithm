## Java Collection

### [ArrayList]

>배열과 비슷하지만, 크기를 변경할 수 있다는 장점을 갖는다.



#### 생성과 사용법

ArrayList를 사용하려면 먼저 ArrayList객체를 만들어야 한다.

```java
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);	//엘리먼트를 추가
numbers.add(20);
numbers.add(30);

numbers.add(1,50);	//1번 인덱스에 값이 50인 엘리먼트를 추가

numbers.remove(2);	//2번 인덱스에 위치한 엘리먼트를 삭제

numbers.get(2);		//2번 인덱스에 위치한 엘리먼트 가져오기

```



#### 반복

> ArrayList를 탐색할 때는 Iterator를 쓴다. Iterator는 객체지향 프로그래밍에서 주로 사용하는 반복 기법니다. Iterator를 쓰려면 우선 Iterator 객체를 만들어야 한다.



```java
Iterator it<Integer> = numbers.iterator();

while(it.hasNext()){
    System.out.println(it.next());
    if(value == 50)
        it.remove();
}

for(int value : numbers){
    System.out.println(value);
}


```



#### 백준 알고리즘 2750번 (수 정렬하기)

> N개의 수가 주어졌을 떄, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.



```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baek_2750 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int nums;
		
		ArrayList<Integer> number = new ArrayList<>();
		
		for(int i =0; i<caseNum; i++) {
			nums = sc.nextInt();
			number.add(nums);
		}
		
		sc.close();
		
		Collections.sort(number);
		print(number);
		
	}

	private static void print(ArrayList<Integer> number) {
		for(int i =0; i<number.size();i++)
			System.out.println(number.get(i));
	}

}

```

