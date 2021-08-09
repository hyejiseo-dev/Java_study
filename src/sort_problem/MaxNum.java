package sort_problem;

import java.util.Arrays;

public class MaxNum {

	public String solution(int[] numbers) {
		 String answer = "";
	     String[] arr = new String[numbers.length];
	     
	     //문자열로 변환 
	     for(int i =0; i < numbers.length;i++) {
	    	 arr[i] = String.valueOf(numbers[i]);
	     }
	     
	     //앞뒤 비교 
	     Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
	     if(arr[0].equals("0")) return "0";
	     
	     for (int i = 0; i < arr.length; i++) {
	    	answer += arr[i];
	     }
	     return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
