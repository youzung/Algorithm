## Comparable & Comparator

> Comparable, Comparator을 이용하여 Java 객체 정렬하기



### 객체 정렬 예시

- 객체를 사용자가 정의한 정렬 기준에 맞춰 정렬해야 하는 경우
  - 좌표를 x좌표가 증가하는 순, x좌표가 같으면 y좌표가 감소하는 순으로 정렬
  - 국어점수는 증가하는 순, 수학점수는 감소하는 순으로 정렬

### 객체의 정렬 기준을 명시하는 두 가지 방법

#### 1. Interface Comparable

> 정렬 수행 시 기본적으로 적용되는 정렬 기준이 되는 메서드를 정의하는 인터페이스



- 구현 방법
  - 정렬할 객체에 Comparable interface를 implements 후, compareTo() 메서드를 오버라이드하여 구현
  - compareTo()메서드 작성법
    - 현재 객체 < 파라미터로 넘어온 객체 : 음수 리턴
    - 현재 객체 == 파라미터로 넘어온 객체 : 0 리턴
    - 현재 객체 > 파라미터로 넘어온 객체 : 양수 리턴
    - 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.
- 사용 방법
  - Arrays.sort(array)
  - Collections.sort(list)



`Comparable interface를 이용한 Java 객체를 정렬`

```java
//x 좌표가 증가하는 순, x좌표가 같으면 y 좌표가 같으면 y좌표가 감소하는 순으로 정렬
class Point implements Comparable<Point>{
    int x, y;
    
    @Override
    public int compareTo(Point p){
        if(this.x > p.x){		//x좌표에 대해서는 오름차순
            return 1;	
        }else if(this.x == p.x){
            if(this.y <p.y){	//y좌표에 대해서는 내림차순
                return 1;
            }
        }
        return -1;
    }
}

//main에서 사용법
List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x,y));
Collections.sort(pointList);
```



#### 2. Interface Comparator

> 정렬 가능한 클래스(Comparable 인터페이스를 구현한 클래스)들의 기본 정렬 기준과 다르게 정렬하고 싶을 때 사용하는 인터페이스
>
> 기본적인 정렬 방법인 오름차순 정렬을 내림차순으로 정렬할 때 많이 사용한다.



- 구현 방법
  - Comparator interface를 implements 후 compare()메서드를 오버라이드한 myComparator class를 작성한다.
  - compare()메서드 작성법
    - 첫 번째 파라미터로 넘어온 객체 < 두 번째 파라미터로 넘어온 객체 : 음수 리턴
    - 첫 번째 파라미터로 넘어온 객체 == 두 번째 파라미터로 넘어온 객체 : 0 리턴
    - 첫 번째 파라미터로 넘어온 객체 > 두 번째 파라미터로 넘어온 객체 : 양수 리턴
    - 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.
- 사용 방법
  - Arrays.sort(array, myComparator)
  - Collections.sort(list, myComparator)
  - Arrays.sort(), Collections.sort() 메서드는 두 번째 인자로 Comparator interface를 받을 수 있다.

`Comparator interface를 이용한 Java객체를 정렬`

```java
class MyComparator implements Comparator<Point>{
    @Override
    public int compare(Point p1, Point p2){
        if(p1.x > p2.x){
            return 1;
        }else if(p1.x == p2.x){
            if(p1.y < p2.y){
                return 1;
            }
        }
        return -1;
    }
}

//main에서 사용법
List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x,y));
MyComparator myComparator = new MyComparator();
Collections.sort(pointList, myComparator);
```



`Comparator 익명 클래스 이용`

```java
Comparator<Point> myComparator = new Comparator<Point>() {
  @Override
  public int compare(Point p1, Point p2) { 위와 동일 }
};

List<Point> pointList = new ArrayList<>();
pointList.add(new Point(x, y));
Collections.sort(pointList, myComparator);
```



##### *Reference*

<https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html> 

