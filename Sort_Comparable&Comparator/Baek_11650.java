package study;

import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point>{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point p) {
		if(this.x < p.x) {
			return -1;
		}else if(this.x == p.x) {
			if(this.y > p.y) {
				return 1;
			}else if(this.y == p.y) {
				return 0;
			}else
				return -1;
		}else
			return 1;
	}
	
}

public class Baek_11650 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int x, y;
		Point[] p = new Point[caseNum];
		
		for(int i = 0; i<caseNum; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			p[i] = new Point(x,y);
			
		}
		
		 sc.close();
		 
		Arrays.sort(p);
		
		StringBuilder sb = new StringBuilder();
		for(Point pt : p) {
			sb.append(pt.x + " " + pt.y+ "\n");
		}
		
		System.out.print(sb);

	
		}

}
