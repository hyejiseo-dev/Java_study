package practice;

import java.util.Arrays;

//예산
public class budget {
	
	public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int result = 0;
        for(int i=0;i<d.length;i++) {
        	result += d[i];
        	if(result <= budget) {
        		answer++;
        	}else {
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(solution(d, budget));
	}

}
