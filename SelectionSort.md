 ## Selection Sort &#128290;

> 선택정렬  알고리즘



#### 선택정렬( Selection Sort ) 알고리즘 개념

- 선택정렬(selection sort)은 정렬되지 않은 데이터들에 대해 가장 작은 데이터를 찾아 맨 앞의 데이터와 교환하여 비내림차순으로 정렬한다. 아래의 배열 list를 정렬하는 과정을 통해 그 방법을 확인해보자! 

  

  ```java
  int [] list = {4, 9, 7, 1, 3, 6, 5};
  ```

  

- 자바에서 간단하게 정렬하는 법

  ```java
  Arrays.sort(list); 	//print out [1, 3, 4, 5, 6, 7, 9]
  
  System.out.println(Arrays.toString(list));
  ```

  

- 선택정렬(Selection sort) 과정 

  

  우선 배열에서 가장 작은 숫자를 맨 앞으로 보낸다. 

  (첫번째 인덱스에 있는 숫자가 가장 작은 숫자가 있는 인덱스로 가게된다.)

  ​			**1**	9	7	**4**	3	6	5		// 1과 4 바꾸기

  이런 식으로 정렬될때까지 반복한다.

  ​			1	**3**	7	4	**9**	6	5		// 3과 9 바꾸기

  ​			1	3	**4**	**7**	9	6	5		// 4와 7 바꾸기

  ​			1	3	4	**5**	9	6	**7**		// 5와 7 바꾸기

  ​			1	3	4	5	**6**	**9**	7		// 6과 9 바꾸기

  ​			1	3	4	5	6	**7**	**9**		// 7과 9 바꾸기 > 완성! 



		> Java 코드

```java

public class SelectionSort {

	public static void main(String[] args) {
		int[] lst = {4,9,7,1,3,6,5};
		int size = lst.length;
        int smallest;
      
        for(int i=0; i<size-1; i++){ 
            smallest = i;
            for(int j=i+1; j<size; j++){
                if(lst[smallest] > lst[j]){
                    smallest = j;
                }
            }
            int temp = lst[smallest];
            lst[smallest] = lst[i];
            lst[i] = temp;
        }

	    System.out.println(Arrays.toString(lst));
	}

}

```





