package study;

public class GroupSequence{

	public static long Solution(long k) {
		long i = 1;
		long j = 0;
		long tmp = 0;
		long result = 0;

		while(true) {
			
			if(i==k) {
				result = 1;
				 break;
			}else if(i>k) {
				tmp = i-j-1;
				result = k-tmp;
				break;
			}
			j++;
			i +=j;
		}
		
		return result;
	}

	//체크해보기!!
	public static void main(String[] args) {
		for(int i =1; i<22; i++) {
			System.out.print(Solution(i));
		}
		
		System.out.println();
		System.out.print(Solution(5));
	}

}
