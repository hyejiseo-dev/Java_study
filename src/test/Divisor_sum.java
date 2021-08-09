package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisor_sum {
	
	 public static int solution(int n) {
	     int answer = n;
	     ArrayList num = new ArrayList();
	     if(n>0 && n<=3000) {
	    	 for(int i=1;i<=n/2;i++) {
	    		 if(n % i == 0) {
	    			 answer += i;
	    			 num.add(i);
	    		 }else {continue;}
	    	 }
			 System.out.printf("%d의 약수는"+num+" 입니다 \n",n);
	     }else {
	    	 answer = 0;
	     }
	     return answer;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		 Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 
		 System.out.printf("약수의 합 : %d",solution(n));
	}
	
	

}
