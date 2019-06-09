package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

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
			if(this.y < p.y)
				return -1;
			else if(this.y == p.y)
				return 0;
			else 
				return 1;
		}else
			return 1;
		}
	
}

public class Baek_11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		
		Point a[] = new Point[caseNum];
		
		for(int i =0; i<caseNum;i++) {
			String temp[] = br.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			
			a[i] = new Point(x,y);

		}

		Arrays.sort(a, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {
				if(p1.y < p2.y) {
					return -1;
				}else if (p1.y == p2.y) {
					if(p1.x < p2.x)
						return -1;
					else if(p1.x == p2.x)
						return 0;
					else
						return 1;
				}else
					return 1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(Point p : a) {
			sb.append(p.x + " " + p.y + "\n");
		}
		
		System.out.print(sb);
		
	}

}
