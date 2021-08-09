package sort_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class minimum {
	public static int solution(int[] a, int[] b) {
		int answer = 0;

		Arrays.sort(a); Arrays.sort(b);
		
		for(int i=0;i<a.length;i++) {
			answer += a[i]*b[a.length-i-1];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		System.out.print(solution(a,b));
	}

}
