package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class divisor_sum {
	
	public static int solution(int left, int right) {
        int answer = 0;
       // ArrayList arr = new ArrayList();
        int cnt = 0;
        for(int n=left;n<=right;n++) {  //시작과 끝의 숫자를 나열 
        	cnt = 0;
        	for(int i=1;i<=n;i++) { //각 숫자의 약수 개수구하기 
        		if(n % i == 0) {
        			cnt++;
        		}
        	}
        	//arr.add(cnt);
        	if(cnt % 2==0) {  //짝수이면 덧셈 
        		answer += n;
        	}else {
        		answer -= n; //홀수이면 뺄셈 
        	}
        	//System.out.println(arr);
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println(solution(13,17));

	}
	

}
