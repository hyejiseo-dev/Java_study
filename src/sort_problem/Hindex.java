package sort_problem;

import java.util.Arrays;

public class Hindex {


	public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
    	
        for(int i=0;i<citations.length;i++) {
        	int h = citations.length-i;
        	
        	if(citations[i]>=h) {  //[0, 1, 3, 5, 6]
        		answer = h;
        		break;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 0, 6, 1, 5};
		Arrays.sort(arr);
    	System.out.println(Arrays.toString(arr));
		System.out.println(solution(arr));
	}

}
