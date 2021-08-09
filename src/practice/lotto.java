package practice;

import java.util.Arrays;

public class lotto {

	 public static int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = {0,0};
	        int cnt = 0;
	        Arrays.sort(lottos);
	        Arrays.sort(win_nums);
	        
	        for(int i=0;i<6;i++){  //겹치는 수에 0의 개수를 더하면 최대
	        	if(lottos[i] == 0){
	        		cnt++;
	        	}
	        }
	        if(cnt == 6) {
	        	answer[1] = 6;
	        }
	        
	        for(int j = 0; j < 6; j++) {  //겹치는 수 구하기 
	            for(int k = cnt; k < 6; k++) {
	                if(win_nums[j] == lottos[k]){ //
	                	answer[0]++;
	                	answer[1]++;
	                }
	            }
	        }
	        answer[0] += cnt;
	        
	        for(int i = 0; i < 2; i++) {
	            if(answer[i] == 6) answer[i] = 1;
	            else if(answer[i] == 5) answer[i] = 2;
	            else if(answer[i] == 4) answer[i] = 3;
	            else if(answer[i] == 3) answer[i] = 4;
	            else if(answer[i] == 2) answer[i] = 5;
	            else answer[i] = 6;
	        }
	        
	        
	        return answer;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		System.out.printf("%s",Arrays.toString(solution(lottos,win_nums)));
	}

}
